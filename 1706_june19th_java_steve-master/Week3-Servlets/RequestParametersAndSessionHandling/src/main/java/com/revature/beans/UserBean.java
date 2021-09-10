package com.revature.beans;

import java.io.Serializable;

//POJO, Bean, Model are all similar names
public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3992482543618848374L;
	
	//state
	private int userId;
	private String username;
	private String password;
	
	
	//NO-ARGS
	public UserBean() {}

	public UserBean(int userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}



	//Getters and Setters
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
