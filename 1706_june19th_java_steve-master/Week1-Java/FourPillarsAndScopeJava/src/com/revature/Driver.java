package com.revature;

import com.revature.abstracts.Breakable;
import com.revature.abstracts.Tool;
import com.revature.pojos.Hammer;

public class Driver {

		int driver = 10;
	
	/*
	 *	4 Pillars:
	 *		Inheritance: child class inherits properties from parents, code reuse ability
	 *		Polymorphism: one thing can take multiple forms e.g. overloading & overriding
	 *		Abstraction:  hides complexity  e.g. Abstract Classes & Interfaces - Blackbox: Know the I/O, but not the code in between
	 *		Encapsulation: restricts random access, providing a channel to validate input
	 *
	 *	Scope: location where variable is active
	 *			where the compiler recognizes the variable currently being used
	 *			lifetime of data
	 *			Where the executing line can see variables
	 *
	 *			4 Scopes in Java:
	 *				1. Local aka block, declare a variable inside any { } 
	 *				2. Parameter aka Method, the arguments past into a method, Not Local because it comes before the { }
	 *				3. Instance aka Object or non-static, declared outside of any method, and in a class, does not use static keyword, must instantiate
	 *				4. Class aka static: static you think class, accessed by the Class Name NOT the object reference 
	 *
	 *	Static: members belong to the Class and not the individual objects
	 *			static means the Memory location doesn't change, NOT the value
	 *			static members do not get inherited, belongs only the class 
	 */
	
	public static void main(String[] args) {

		Hammer myHammer1 = new Hammer();
		Hammer myHammer2 = new Hammer();
		Hammer myHammer3 = new Hammer();
		
		myHammer2.setName("Bat");
		myHammer3.brand = " a different brand"; //changing the static brand value for ALL instances 
//		ClassName.staticMember = whateverValue
		Hammer.brand = "New brand"; //Correct way to update a static member
		
		System.out.println(Hammer.brand );
		System.out.println(myHammer2.brand );	//accessing a static member from an instace is bad practice, because it is like treating as an instance scope
		System.out.println(myHammer3.brand );
		
		
		if(true){
//			int x;
//			System.out.println(x);	Local Variables never get default value, this commonly asked questions
		}
		
		addNumbers(5,6);
		
		myHammer3.breakStuff();
		
		new Driver().fourpillars(); //fourpillars method is in a different scope, the instance scope aka non-static
	}
	
	
	public static int addNumbers(int x, int y){ //Default values for a parameter scopes are the values past into the method upon invoking the method
		
		Hammer.brand = "changing static brand";
		return x + y;
	}
	
	
	
	
	//4 pillars code example
	public void fourpillars(){ //Non-static method
//		new Tool() can't instantiate because Tool is an Abstract class
		
		//Object reference	//right side: object instantiation
		Hammer myHammer = new Hammer();	//right side must pass the IS-A Rule!
		Breakable myBreakableHammer = new Hammer();
		Tool myToolHammer = new Hammer();	
		
		myHammer.doWorkWithTool(); 		//Which doWorkWithTool method is called, the one found in the Hammer Class or Tool Class?
		myToolHammer.doWorkWithTool();
		
		((Hammer) myBreakableHammer).doWorkWithTool();  //shorthand casting
		myBreakableHammer = (Hammer) myBreakableHammer; //Can't change the Object reference type just by casting, Strictly typed
		
		Hammer hammerer =  (Hammer) myBreakableHammer;
		hammerer.doWorkWithTool();
		System.out.println(myHammer);
		
		hammerer = null;	
		hammerer.breakTool(); //hammerer is set to null, what happens when trying to invoke breakTool()? - NullPointerException
		
//		new Breakable(); can't instantiate because Breakable is an Interface
		
	}
}
