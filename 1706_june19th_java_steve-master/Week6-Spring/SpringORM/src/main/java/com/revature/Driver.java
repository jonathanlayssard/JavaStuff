package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.pojo.FlashCard;
import com.revature.service.AppService;

public class Driver {

	/*
	 * Spring ORM
	 * 	-What is the point of spring orm?
	 * 		is to integrate an ORM Framework like Hibernate with Spring
	 * 
	 * -Additional Benefits of Spring ORM?
	 * 		No longer open/close session, only getCurrentSession
	 * 		No longer have to worry about transactions, spring provides a transaction manager
	 * 
	 * This example will be persisting FlashCards!
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello Spring ORM");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		AppService app = (AppService) ac.getBean("AppService");
		
		FlashCard fc = new FlashCard();
		fc.setFcId(4);
		fc = app.getFlashCardById(fc);
		
		System.out.println(fc);
	}

}
