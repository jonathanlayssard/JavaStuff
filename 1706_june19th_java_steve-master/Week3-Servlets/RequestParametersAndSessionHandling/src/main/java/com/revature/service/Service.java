package com.revature.service;

import com.revature.beans.UserBean;
import com.revature.dao.Dao;
import com.revature.dao.DaoImpl;

public class Service {

	
	public UserBean authenticateUser(UserBean user){
		//This method will validate a users username & password
		
		/*
		 * 	How can authenticate the user?
		 * 		-the Service will use DAO methods to complete the task!
		 * 
		 */
		Dao dao = new DaoImpl();
		UserBean dbUser = dao.getUserByUsername(user);
		
		if( dbUser.getUsername().equals(user.getUsername() )  
				&& dbUser.getPassword().equals(user.getPassword())){
			return dbUser;
		}
		return null;
	}
	
}
