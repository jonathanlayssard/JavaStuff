package com.revature;

import com.revature.pojos.Hammer;

public class MainClass {

	/*
	 * 	Strings: immutable - once the object is created the object doesn't change
	 * 							but the object reference can be changed
	 *  StringBuffer:  is mutable, Is thread safe aka synchronized, only one thread can access this class at a time
	 *  StringBuilder: is mutable, not thread safe, is not synchronized
	 * 
	 */
	
	public static void main(String[] args) {
		String cat = "cat"; //Good, cat is found in the String Pool
		String catdog = new String("catdog"); //Bad, creating 2 objects, the String Literal is placed into the the String Pool, while the other object is not
		
		cat = cat.concat("dog"); 			//catdog 1
		//cap firstletter					//Catdog 2
		//space between cat and dog			//Cat dog 3
		//cap 2nd word						//Cat Dog 4
		
		StringBuilder catDog = new StringBuilder("catdog"); //Is mutable, not thread safe, is not synchronized
		
		//Thread = independent state of execution
		StringBuffer  aCatDog = new StringBuffer("catdog"); //Is mutable, Is thread safe aka synchronized, only one thread can access this class at a time
		catDog.append("hello");
		System.out.println(catDog);
		
		String hello = "hello";
		Hammer h = new Hammer();
		h.setName("hello");
		if( h.getName() == hello){
			System.out.println("true");
		}
	}

}
