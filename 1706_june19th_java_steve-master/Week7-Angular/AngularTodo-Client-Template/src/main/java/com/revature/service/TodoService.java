package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Todo;
import com.revature.repository.Dao;

@Service
@Transactional
public class TodoService {

	@Autowired
	Dao todoDao;
	
	public void saveTodo(Todo todo){
		System.out.println("TodoService - saving Object todo");
		todoDao.saveTodo(todo);
	}
	
}
