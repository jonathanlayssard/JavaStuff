package com.ex.serialization;

public class Student extends Person {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4044132724006829720L;
	
	private double gpa;

	public Student(){}
	
	public Student(double gpa) {
		super();
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + "]";
	}
	
	
	
	
}
