package com.revature;

import com.revature.pojo.Student;

public class FactoryPattern {
/*
 * Classes that create other objects are factories
 * 
 */
	
	//a lot of state
	
	public static Student createStudent(){
		return new Student();
	}
	
}
