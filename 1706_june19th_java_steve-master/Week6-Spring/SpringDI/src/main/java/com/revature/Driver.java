package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.pojo.House;
import com.revature.service.AppService;

public class Driver {

	/*
	 * Spring DI: Dependency Injection
	 * 
	 * Spring it going to hold our dependencies (our objects) 
	 * 	and inject them where need (apply new object())
	 * 
	 * What is needed for Spring to do DI?
	 * 	 Configure the spring container
	 * 		-by xml
	 * 		-by @s
	 * 		-This example will be using XML 
	 * 
	 * How instantiate a spring container?
	 * 		-beanFactory (old) the parent class, lazy loads beans
	 *		-applicationContext (new) the child class, eagerly loads beans
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("hello spring!");
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		AppService app = (AppService) ac.getBean("service");
		app.saveHouse();
		
		System.out.println("end of app");
	}
	
	
	
	
	
	
	public static void xmlDIExample(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		House house = (House) ac.getBean("house");
		System.out.println(house);
		
		House anotherHouse = (House) ac.getBean("house");
		anotherHouse.setName("another house");
		anotherHouse.setWallColor("blue");
		
		System.out.println(house);
		System.out.println(anotherHouse);
	}

}
