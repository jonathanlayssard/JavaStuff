package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dao.Dao;
import com.revature.pojo.FlashCard;

@Service(value="AppService") //will be applied as a bean, and used with the transactionManager when needed
@Transactional 
public class AppService {

	@Autowired
	private Dao dao;
	
	
	@Transactional //tells that transaction is about to occur
	public void saveFlashCard(FlashCard fc){
		dao.createFlashCard(fc);
	}
	
	/**
	 * Test of JavaDoc
	 */
	public FlashCard getFlashCardById(FlashCard fc){
		return dao.getFlashCardById(fc);
	}
	
}
