package com.revature.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.model.Todo;

@Repository
public class TodoDaoImpl implements Dao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveTodo(Todo todo) {
		System.out.println("Todo-Repo saving Todo Object");
		Session session = sessionFactory.getCurrentSession();
		session.save(todo);
	}

	
}
