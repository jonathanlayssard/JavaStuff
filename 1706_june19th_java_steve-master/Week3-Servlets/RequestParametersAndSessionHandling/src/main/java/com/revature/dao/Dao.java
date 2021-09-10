package com.revature.dao;

import com.revature.beans.UserBean;

public interface Dao {

	/*
	 * 	CRUD Operations Only!
	 * 
	 */
	
	
	//Read
	public UserBean getUserByUsername(UserBean user);
	
	
}
