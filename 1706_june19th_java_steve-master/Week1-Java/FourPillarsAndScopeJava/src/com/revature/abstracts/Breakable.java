package com.revature.abstracts;


/*
 * 	Interfaces 	- are contracts
 * 		can't instantiate an interface
 * 		All states are implicitly final, public, static
 * 		All methods are implicitly abstract
 * 		classes "implements" interfaces
 * 
 * 
 * 	Extends vs Implements Rule: 
 * 			only extends one class but implements many
 * 			Same name extends, different name implements
 * 				e.g. classes extends classes, only once
 * 					 Interfaces extends Interfaces,	 many
 * 					 classes implements Interfaces, many 
 * 
 * 		Interfaces: Java 1.8 interfaces can have concrete methods.....
 * 
 */
public interface Breakable{

	public static final int strength = 10; //implicitly final because it bold
						int strength2 = 10;//also public static final
	
						
	public  abstract void breakTool(); //implicitly abstract
	
	
	public default void breakStuff(){
		//this interface method to not be abstract 
		System.out.println("breakstuff - concrete method in an Interface");
	}
}
