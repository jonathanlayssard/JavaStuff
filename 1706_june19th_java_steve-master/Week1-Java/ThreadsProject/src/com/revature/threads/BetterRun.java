package com.revature.threads;

import java.io.FileWriter;
import java.io.IOException;

public class BetterRun implements Runnable{

	/*
	 *  Use Runnable when you just want to create a process to execute
	 *  	-use for logging
	 *  	-write an email
	 *  	-etc
	 */
	
	@Override
	public void run() {
		//logging 
		String filepath = "src/com/revature/threads/log.txt";
		try (FileWriter fw = new FileWriter(filepath);){
			
			for(int i =0; i < 10; i++){
				System.out.println("\t \t \t \t " + Thread.currentThread().getName());
				fw.write("foo");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	
	
}
