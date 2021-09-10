package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.AppService;

public class Driver {

	/*
	 *  AOP - Not specific to Spring, spring just uses it too
	 *  
	 *  	Aspect Oriented Programming
	 *  
	 *   Highjack methods to build a module with it (aspect)
	 *   	Aspect is the module you are building like:
	 *   		-logging module
	 *   		-transactions module
	 *   		-security module
	 *   		(bread crumb system)
	 */
	public static void main(String[] args) {
		System.out.println("spring aop");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		AppService app = (AppService) ac.getBean("appService");
		
		app.playComedyShow();
		app.playConcert();
		app.runAmusementPark();
	}
	
}
