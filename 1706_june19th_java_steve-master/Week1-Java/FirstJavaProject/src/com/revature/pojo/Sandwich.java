package com.revature.pojo;


//POJO: Plain Old Java Object, no entry point, has state and behavior
public class Sandwich {

	//State: variables
	String name;
	String bread;
	String meat;
	boolean isEaten;
	int layers;
	
	//Constructor: creates the object and sets the state
			//Default constructor: given by compiler when no constructor is written, is a of a type: no-args
	public Sandwich(){	//no-args constructor
		
	}
	//Constructor or methods with the same name and different parameters are called Overloaded: IQ***
	public Sandwich(String name){
		this.name = name; //"this": current object
	}
	
	
	//Behavior: methods
	public void eatSandwitch(){
		System.out.println("sandwich is eaten" + " name of sandwich: " + name);
		isEaten = true;
	}
	
}
