package com.revature;

public class Test {

	static int a = 5;
	public static void main(String[] args) {
		Test.a = 110;
		int a, b;
		a = 5;
		b= 6;
		
		Thread thread = new MyExtendedThread();
		thread.start(); // call thread.run()
		for(int i = 0; i < 10; i++)
			System.out.println(addNumber(a,b));

	}

	
	public static int addNumber(int x, int y){
		
		int a = x;
		int b = y;
		return y;
		
	}
}
