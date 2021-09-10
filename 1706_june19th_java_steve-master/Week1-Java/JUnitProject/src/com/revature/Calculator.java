package com.revature;

public interface Calculator {

	/*
	 * Basic Calculator methods
	 */
	
	public int add(int x, int y);
	public int subtract(int x, int y);
	public int multiple(int x, int y);
	public int divide(int x, int y) throws IllegalArgumentException;
	
	public void timeTooLong();
	
}
