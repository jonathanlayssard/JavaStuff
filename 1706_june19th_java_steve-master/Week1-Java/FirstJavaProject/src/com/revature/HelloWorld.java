//packages: prevent naming conflicts
package com.revature;

import com.revature.pojo.Computer;
import com.revature.pojo.Person;
import com.revature.pojo.Sandwich;	//import states are just for shorthand path
import com.revature.pojo.Student;

public class HelloWorld {


	//*This is an OCA question, main method signature can't be modified
	public static void main(String[] args) {
		//4 Pillars of OOP 
			//Inheritance: sub/child class inherit state and behavior
			//Polymorphism: many forms, e.g. overriding and overloading
			//Abstraction
			//Encapsulation: restricting random access, using getters and setters: allowing to validate inputs
		
		//Restrict access: Access modifier
				/*
				 * private - only this class can access
				 * default
				 * protected
				 * public - any class or package or even other projects can access
				 */
		Person john = new Person();
		john.setName("John");
		System.out.println(john);
		
		
		new Student().talk();
		
		System.out.println(new Computer());
		
	}
	
	//Examples on Flow Control: e.g. loops, ifs, switch
	public void flowControl(){
		int[] myArray = {1,2,3,4,5}; //5
		int[] myArray2 = new int[3]; //3 is the size of this array
		int myArray3[];
		
		int[][] my2dArray;
		int my2dArray2[][];	//all valid declaration of 2d arrays, OCA question
		int[] my2dArray3[];
		
		//int default value = 0
		//String default value = null because Strings are an object
		
		for(int i = 0; i < myArray2.length;i++){
			System.out.println("my array: " + myArray2[i]);
		}
		
		//Enhance for loop: simple traversal
		for(int element : myArray){
			System.out.println("myArray: " + element);
		}
		
		
		
		//Loops: for, while, do while enhanced forloop, switch 
		for(int i = 10; i >= 5; i--){
			//do some code
			System.out.println(i--);
		}
		
		int x = 10;
		while(x < 100){
			
			if(x == 50){
				System.out.println(x);
				break;		//break: breaks out of the statement
									//must be used in either a loop or switch statement
//				continue;	//continue: go to the next iteration, any code below will be skipped for this iteration
			}
			System.out.println(x);
			x++;
		}
		
		
		//Do While is going to execute at LEAST once
		int i = 0;
		do{
			System.out.println("in the do/while loop");
			i--;
		}while(i > -10);
		
		
		//Switch: test cases
		int switchValue = 5;
		final int six = 6; //final keyword: once assigned can't reassign

		switch(++switchValue ){	//can't use booleans in switch statements
			case six: System.out.println("whatever the value is");
//				break;
			case 3: System.out.println("not the value");
			default: System.out.println("this is default");
		}
	}
	
	
	
	
	
	
	
	
	
	//if, else if, else examples with short curit
	public static void ifExamples(){
		//flow control: if, if else, if else if else, Loops: for, while, do while enhanced forloop, switch 
				if(false  || !shortCuritExample()){
					//do something
					System.out.println("this is true");
				}else if (true && shortCuritExample()){
					System.out.println("this was false");
				}else if(true){
					
				}else if(true){
					
				}else{
					
				}
	}
	
	public static boolean shortCuritExample(){
		System.out.println("called shortCuritExample method");
		return true;
	}
	
	
	
	
	
	
	
	
	
	public void classObjectExample(){
		String sandwichName = "turkey"; //this sandwich was giving by a user
		
		Sandwich turkey = new Sandwich(); //ctrl + shift + o
		turkey.eatSandwitch();
	}
	
	//primitives example
	public void primitives(){
		// the entry to our application
		System.out.println("HelloWorld");
		System.out.println("ctrl + spacebar"); //ctrl + spacebar will convert to a full System.out.println();
		
		
		//Primitive Datatypes
		byte b = 1;		//8 bit smaller integer
		short s = -75;	//16 bit
		int a = 1;		//32 bit
//		long x = 20_000;//64 bit biggest integer
		
		float f = 0.2f;	//32 bits 	floating point decimals
		double d = 3.2; //64 bits
		
		boolean isTrue = true; // N/A
		char c = 'c';	//16bits
		
		//String is not a primitive datatype because String is a class
		String name = "steve";
		
		/*
		 * Wrapper Class - All primitive DataTypes have a corresponding Wrapper Class
		 * 		e.g. int to Integer
		 * 			 boolean to Boolean
		 * 			 double to Double 
		 * 
		 * 		Wrapper Classes:
		 * 				-final
		 * 				-allows for boxing and unboxing
		 * 
		 * 		Autoboxing: automatically converting a primitive into an Object
		 * 			Boxing: converting primitive into an corresponding wrapper class object
		 * 		  unboxing: converting object back into primitive
		 * 		
		 */		
		
		int xPrimitive = 10;
		
		
		Integer i = 5; //Didn't use the "new" keyword: autoboxing
		String number = "5";
		xPrimitive = i;  //unboxing the object back into a primitive
		
		
		Integer iNotBoxed = new Integer(5); //manaully Boxing, until Java 1.5 must use the new keyword
		Double z = 2.5;
			
	}
	
	
}





