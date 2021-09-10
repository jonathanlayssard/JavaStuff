package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.model.BankAccount;
import com.revature.model.BankUser;

public class BankUserDaoImpl implements BankUserDao{

	private static final String USERNAME = "bank_db";
	private static final String PASSWORD = "p4ssw0rd";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	
	
	@Override
	public BankUser getUserByUsername(BankUser user) {
			BankUser dbUser = null;
			try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);){
				String sql = "SELECT * FROM bank_user WHERE bu_username = ?";
				
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user.getUsername());
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					dbUser = new BankUser(rs.getInt("BU_ID"),rs.getString("BU_USERNAME"),rs.getString("BU_FIRST_NAME"),
							rs.getString("BU_LAST_NAME"), rs.getString("BU_PASSWORD"));
				};
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return dbUser;
	}



	@Override
	public BankAccount getBankAccountByUserId(BankUser user) {
		BankAccount dbAccount = null;
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);){
			String sql = "SELECT * FROM bank_account WHERE bu_id = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("-----------------BankAccount found---------------");
				dbAccount = new BankAccount(rs.getInt("ba_number"), rs.getDouble("ba_balance"), rs.getInt("bu_id"));
				System.out.println(dbAccount);
			};
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return dbAccount;
		
	}

}
