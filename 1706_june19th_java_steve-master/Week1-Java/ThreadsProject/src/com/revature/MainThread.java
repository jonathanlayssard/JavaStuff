package com.revature;

import com.revature.threads.BetterRun;
import com.revature.threads.ChildThread;

public class MainThread {

	/*
	 * Thread: 
	 * 		-single point of execution
	 * 		-independent state of execution
	 * 		-process that can run concurrently with other processes
	 * 
	 * Multithreading: 2 or threads running at the *same time*
	 * 		-thread can't be forced to run over another thread
	 * 		-We can set priorities for threads 1-10, default is 5
	 * 
	 * 
	 */
	
	
	
	/*
	 *  	MainThread Class on thread1
	 *  	ChildThread Class on thread2
	 *  	BetterRun Class on thread3
	 */
	public static void main(String[] args) {

		//Process for thread3
		Runnable betterRun = new BetterRun();
		Thread runnable = new Thread(betterRun); //Thread Class will call the BetterRun's  run()
		runnable.setPriority(10); //change the priority to TRY to have this thread run more often
		runnable.start();
		
		//Process for thread2
		Thread worker = new ChildThread(); //ChildThread will have the new run() method 
		worker.setPriority(1); //changed the priority to 1 to not run as often, hopefully
		worker.start(); //start() creates a new thread and then invokes the run()

		
		//Process for thread1
		int x = 0;
		while(x < 10){
			System.out.println("MainThread "); //my process in the MainThread class
			x++;
		}
		
	}

}
