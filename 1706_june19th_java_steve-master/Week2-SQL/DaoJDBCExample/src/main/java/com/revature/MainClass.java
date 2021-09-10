package com.revature;

import com.revature.dao.Dao;
import com.revature.dao.FlashCardDaoImpl;
import com.revature.pojo.FlashCard;

public class MainClass {

	/*
	 * 		DAO: Data Access Object
	 * 		DAL: Data Access Layer - the package with DAO objects
	 * 		A class that only has CRUD operations
	 * 
	 */
	public static void main(String[] args) {
		//User entered 18 for the flashcard id
		FlashCard fc = new FlashCard(18,null, null);

		Dao fcDao = new FlashCardDaoImpl();
		fc = fcDao.getFlashCardById(fc);
		
		System.out.println(fc);
		

	}

}



