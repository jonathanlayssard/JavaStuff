package com.ex.exceptionhandling;

public class WithdrawTooBigException extends RuntimeException {
	
	public WithdrawTooBigException(){}
	
	public WithdrawTooBigException(String message){
		super(message);
	}
	
	public WithdrawTooBigException(String message, Throwable cause){
		super(message, cause);
	}
	
}
