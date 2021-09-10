package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.pojo.House;

public class AppService {

	//DI through Reflection, an API in java to inspect and manipulate the class at Runtime
	@Autowired
	private Dao dao;
	
	public void saveHouse(){
		//save a house using the dao
		System.out.println("service is calling the dao to save the house");
		dao.saveHouse(new House());
	}

	
}
