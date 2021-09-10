package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.pojo.FlashCard;

public class FlashCardDaoImpl implements Dao{
	/*
	 *  DaoImpl implements a Dao Interfaces
	 */
	private static final String USERNAME = "flashcard_db";
	private static final String PASSWORD = "p4ssw0rd";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	@Override
	public void insertFc(FlashCard fc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FlashCard getFlashCardById(FlashCard fc) {
		FlashCard returnedFc = null;
		String sql = "SELECT * FROM flashcard WHERE fc_id = ?";
		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);){
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, fc.getId());
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				returnedFc = new FlashCard(rs.getInt(1), rs.getString("fc_question"), rs.getString(3));
//				rs.getString("fc_question") = getString is overloaded and you can provide the column name instead
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnedFc;
	}

	@Override
	public FlashCard getFlashCardByQuestion(FlashCard fc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlashCard> getAllFlashCards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFlashCard(FlashCard fc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlashCard(FlashCard fc) {
		// TODO Auto-generated method stub
		
	}

}
