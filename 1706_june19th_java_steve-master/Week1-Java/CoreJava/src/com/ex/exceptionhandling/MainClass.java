package com.ex.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) throws FileNotFoundException{
		
		printPositiveNumber(-10);
		
		try {
			bankTransaction("Withdraw", 150);
		} catch (BankTransactionException e) {
//			e.printStackTrace();
		}
		
		
	}
	
	
	
	static void printPositiveNumber(int x){
		if(x < 0){
			throw new LessThanZeroException(x + " is less than zero");
		}else {
			System.out.println("x: " + x);
		}
	}
	
	
	
	
	
	
	static void bankTransaction(String action, double amount) throws BankTransactionException{
		
		if(action.equals("Withdraw")){
			try {
				withdraw(amount);
			}catch (WithdrawTooBigException e) {
				throw new BankTransactionException("There is something wrong with a bank transaction", e);
			}
		}
		
	}
	
	
	static void withdraw(double withdrawAmount) throws WithdrawTooBigException{
		double maxWithdrawAmount = 100; //Theoretically pulled from external source
		
		if(withdrawAmount > maxWithdrawAmount){
			throw new WithdrawTooBigException(withdrawAmount + " exceeds the max withdraw amount of: " + maxWithdrawAmount);
		}
		
	}
	
	
}
