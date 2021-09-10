package com.revature.pojo;
								//Comparable defines the natural/default ordering
public class Student implements Comparable<Student>{

	//State
	private int id;
	private String name;
	private double gpa;
	
	//NO-ARGS
	public Student() {}

	public Student(int id, String name, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	
	//Behavior

	//Getter and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	//toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.id - o.id; //positive, 0, negative to determine the order
	}

	
	

	
}
