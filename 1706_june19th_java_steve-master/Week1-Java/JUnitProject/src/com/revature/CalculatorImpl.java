package com.revature;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int subtract(int x, int y) {
		return x - y;
	}

	@Override
	public int multiple(int x, int y) {
		return x * y;
	}

	@Override
	public int divide(int x, int y) throws IllegalArgumentException {
		if(y == 0){
			throw new IllegalArgumentException();
		}
		return x/y;
	}

	@Override
	public void timeTooLong() {
		while(true){
			//process that shouldn't take that long
		}
	}

}
