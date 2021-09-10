package com.revature.abstracts;



/*
 * 	Abstract Class:
 * 		can't instantiate
 * 		can have BOTH abstract methods and concrete methods
 * 		Classes extends Abstracts Classes
 * 
 * 	Concrete method: any method that has { } after the signature
 *  Abstract method: method without a body
 */

//POJO: Plain Old Java Object: by convention POJOs have state, behavior, toString - doesn't really gaurentee anything!
public abstract class Tool {

	
	//state
	private String name; 		//instance scope variable
	protected String type;		//instance scope variable
	private String material;	//instance scope variable
	
	//no-args constructor
	public Tool() {
		System.out.println("Creating a Tool");
		this.material = "wood";
	} 	//why for abstract class?
	
	
	public Tool(String name, String type) {
		this();
		this.name = name;
		this.type = type;

	}


	//Behavior
	public void doWorkWithTool(){		//Concrete method
		System.out.println("doing work");	
	}
	
	public abstract void hammer();
	
	
	//Getters and Setters - Accessors and Mutators 


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	//Overriden toString
	@Override
	public String toString() {
		return "Tool [name=" + name + ", type=" + type + ", material=" + material + "]";
	}
	
}
