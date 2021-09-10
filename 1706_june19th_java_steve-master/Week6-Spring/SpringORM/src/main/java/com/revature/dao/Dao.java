package com.revature.dao;

import com.revature.pojo.FlashCard;

public interface Dao {

	
	public void createFlashCard(FlashCard fc);
	
	public FlashCard getFlashCardById(FlashCard fc);
	
}
