package com.revature;

public class MyExtendedThread extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 20; i++){
			System.out.println(i + " loop number of extended thread");
		}
	}

}
