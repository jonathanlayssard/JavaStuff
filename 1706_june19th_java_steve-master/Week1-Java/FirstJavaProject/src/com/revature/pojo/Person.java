package com.revature.pojo;

//POJO: Plain Old Java Object
public class Person extends Object{

	/*
	 *  Access Modifiers:
	 *  	private: only seen inside the class
	 */
	
	//State
	private String name;
	private String phoneNumber;
	private String areaCode;
	
	//No-args constructors
	public Person() {}
	
	//behavior
	public final void talk(){
		System.out.println(name + " phone number is:" + phoneNumber);
	}
	
	//Setters and Getters
	public void setName(String name){	//the parameter name is shadowing the object String name
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
//		if(phoneNumber contains -){
//			//remo
//		}
		
		if(phoneNumber.length() > 7){
			//set the first digits to the areaCode
			
			//the last 7 digits would be assigned to the phoneNumber
		}
		this.phoneNumber = phoneNumber;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	//Override that toString();
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + ", areaCode=" + areaCode + "]";
	}
	
	
	
}
