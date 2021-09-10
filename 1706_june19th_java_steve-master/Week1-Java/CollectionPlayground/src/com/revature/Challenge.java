package com.revature;

public class Challenge {

	/*
	 *  Only be able to Instantiate the Challenge class once
	 *  
	 *  Design Pattern: Singleton, designed to only ever create once instance
	 *  
	 */
	
	private static Challenge challenge;
	private int age;
	
	
	private Challenge(){
		this.age = 10;
	}
	
	public static Challenge getInstance(){
		if(challenge == null){
			challenge = new Challenge();
		}
		return challenge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
