package com.revature.threads;

/*
 * 	What are we trying to accomplish when we extend from a class?
 * 		-specialized class of the parent, aka a more Specific version
 * 
 * 	Do not extends Thread class unless you're changing the way a thread works
 * 
 */
public class ChildThread extends Thread{

	
	/*
	 *  Override the run() method found in the Thread class
	 *  	then provide whatever the process you want to execute 
	 * 
	 */
	@Override
	public void run() {
		//Provide new process
		for(int i = 0; i < 10; i++){
			System.out.println("\t \t + childthread");
		}
	
	}
	
}
