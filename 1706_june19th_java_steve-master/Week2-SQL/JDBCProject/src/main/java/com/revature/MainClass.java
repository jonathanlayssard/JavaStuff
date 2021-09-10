package com.revature;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) {
		//Required for Connection
		/*
		 *  Username and Password
		 *  Url to the DB
		 *  Driver  (added via the ojdbc7 jar)
		 */
		
		//Types of Statements
		/*
		 * 		statement:	vulnerable to SQL injections
		 * 
		 * 		preparedStatement: precompiles the statements without the variables, less chance of SQL Injection
		 * 
		 * 		callableStatement: calling stored procedures
		 */
		//Transactions
		/*
		 * 	What is a transaction?
		 * 		-Any permanent change to the database
		 * 		-Transaction Isolation: a current transaction will not affect another transaction
		 * 				Transactions running independently 
		 * 		-All or nothing for transactions: Atomic
		 * 		-JDBC has auto commit set to true by default!
		 * 		-Durable: persist data beyond shutting off application
		 * 		-Consistency: transactions should do the same thing over and over again provided the same inputs
		 * 
		 * 		Properties of a Transaction
		 * 			ACID
		 * 			-Atomic
		 * 			-Consistent: integrity, same inputs same results
		 * 			-Isolated
		 * 				-Transaction Isolation Levels: Research Assignment, 4 levels
		 * 			-Durable
		 */
		
		
		//Connect to Flashcard_db
		String username = "flashcard_db";
		String password = "p4ssw0rd";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		//CallableStatement - invoke/call a stored procedures
		String err = "";
		try (Connection connect = DriverManager.getConnection(url, username, password);) {
			String q = "Hello callablestatment??";
			String a = "Goodbye stored proc!";
	
			
			//Use { }, will still go through without it, but won't get returned correctly
			String sql = "{call insert_fc_proc(?,?,?)}"; //Notes this will fail in first try because no { }
			
			CallableStatement cs = connect.prepareCall(sql);
			cs.setString(1, q);
			cs.setString(2, a);
			cs.setString(3, err); //err will hold the error message
			int numOfRowChanged = cs.executeUpdate();
			System.out.println("Number of rows changed: " + numOfRowChanged);
		
			
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("Error message: " + err);
		}

	
	}

	
	
	
	
	
	
	
	public void sqlStatementExample(String username, String password, String url){
		//Place connection in Try W/ Resources ()
		try (Connection connect = DriverManager.getConnection(url, username, password);) {
				//Insert a flash card
			String some_q = "Rebort); DROP TABLE flashcard; --";
			String some_a = "is it me youre looking for?";
			
			
			
			String sql = "INSERT INTO flashcard(fc_question,fc_answer) VALUES('" + some_q + "','" + some_a + "')";
			Statement statement = connect.createStatement();
			statement.executeUpdate(sql); //To invoke the statement 2 Choices:
							//executeQuery - Select
							//executeUpdate - Insert/Update/Delete
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void sqlPreparementExamples(String username, String password, String url){
		//PreparedStatement
		try (Connection connect = DriverManager.getConnection(url, username, password);){
			String some_q = "What is the); DROP Student meaning of life???";
			String some_a = "42!!";
																//? is a placeholder that we register later
			String sql = "INSERT INTO flashcard(fc_question,fc_answer) VALUES(?,?)";
			
			//If running multiple statements as a single transaction, must turn autocommit(false)
			connect.setAutoCommit(false);
			
//----------------------------------------------
			//first statement
			PreparedStatement ps = connect.prepareStatement(sql); //Precompiles  the statement without variables
			ps.setString(1, some_q); //1 = the first ?
						//Not Zero based...
			ps.setString(2, some_a); //2 = the 2nd ? in the VALUES(?,?)
			ps.executeUpdate();			//invoke
			
			
			//second statement
			String some_q2 = "question2";
			String some_a2 = "answer2";
			String sql2 = "INSERT INTO flashcard(fc_question,fc_answer) VALUES(?,?)";
			PreparedStatement ps2 = connect.prepareStatement(sql2); 
			ps2.setString(1, some_q2); 
			ps2.setString(2, some_a2); 
			ps2.executeUpdate();
//----------------------------------------------
			connect.commit();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
//		//PreparedStatement: Get a FlashCard with an ID of 18
//		try (Connection connect = DriverManager.getConnection(url, username, password);){									//? is a placeholder that we register later
//			String sql = "SELECT * FROM flashcard WHERE fc_id = 21";
//			PreparedStatement ps = connect.prepareStatement(sql); //Precompiles  the statement without variables
//			ResultSet rs = ps.executeQuery();	//invoke a SELECT statement
//			System.out.println(rs);
//			while(rs.next()){
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + rs.getString(3));	
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
	}
}
