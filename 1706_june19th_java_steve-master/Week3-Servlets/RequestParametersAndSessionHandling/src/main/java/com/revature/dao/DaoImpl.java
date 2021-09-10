package com.revature.dao;

import com.revature.beans.UserBean;

public class DaoImpl implements Dao {

	@Override
	public UserBean getUserByUsername(UserBean user) {
		UserBean dbUser = null;
		/*
		 *  preparedStatement using a 
		 *  
		 *  Select * FROM Users WHERE username = user.getUsername();
		 * 
		 */
			dbUser = new UserBean(1, "steve", "123");
		return dbUser;
	}

	
}
