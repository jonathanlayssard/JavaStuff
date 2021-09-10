package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.revature.pojo.FlashCard;

@Repository	//Makes it a bean, and used with the TransactionManager
public class FlashCardDaoImpl implements Dao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createFlashCard(FlashCard fc) {
		System.out.println("creating fc");
		Session session = sessionFactory.getCurrentSession();
		session.save(fc);
	}

	@Override
	public FlashCard getFlashCardById(FlashCard fc) {
		System.out.println("pulling fc from db");
		Session session = sessionFactory.getCurrentSession();
		return (FlashCard) session.get(FlashCard.class, fc.getFcId());
	}

}
