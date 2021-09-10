package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Todo;
import com.revature.service.TodoService;

@RestController
//@RequestMapping("/rest/")
public class TodoCtrl {

	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ResponseEntity<Todo> saveTodo(@RequestBody Todo todo){
		System.out.println("Saving Object Todo" + todo);
		
		todoService.saveTodo(todo);
		
		return new ResponseEntity<Todo>(HttpStatus.OK);
	}
	
	
}
