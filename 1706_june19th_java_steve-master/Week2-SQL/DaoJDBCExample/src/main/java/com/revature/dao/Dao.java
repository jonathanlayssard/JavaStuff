package com.revature.dao;

import java.util.List;

import com.revature.pojo.FlashCard;

public interface Dao {

	/*
	 * 		CRUD Operations Only!
	 * 			CREATE
	 * 			READ
	 * 			UPDATE
	 * 			DELETE
	 * 
	 */
	
	//CREATE
	public void insertFc(FlashCard fc);
	
	//READ
	public FlashCard getFlashCardById(FlashCard fc); //Java OOP use Objects over primitives
	public FlashCard getFlashCardByQuestion(FlashCard fc);
	public List<FlashCard> getAllFlashCards();
	
	//UPDATE
	public void setFlashCard(FlashCard fc);
	
	//DELETE
	public void deleteFlashCard(FlashCard fc);
	
	
	
}
