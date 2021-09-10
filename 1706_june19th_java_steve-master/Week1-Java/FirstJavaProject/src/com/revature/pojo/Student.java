package com.revature.pojo;

//POJO
public class Student extends Person  { //implicit
	
	//Overriding: changing the inherited method implementation
	@Override //@ = annotation, helps you from accidentally overloading when you meant to override
	public String toString() {
		System.out.println("toString called from Student");
		return "Student toString"; //super refers to the parent class
	}
	
	
	//Example of Overloading the toString() by adding a String Argument 
	public String toString(String name) {
		System.out.println("toString called from Student");
		return super.toString(); //super refers to the parent class
	}
	
	//No-Args
	public Student(){
		
		
	}
	
	//behavior
//	@Override
//	public void talk() {
//		System.out.println("I am student talking");
//	}
}
