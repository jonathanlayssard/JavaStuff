package com.revature.pojos;

import com.revature.abstracts.Breakable;
import com.revature.abstracts.Tool;

public class Hammer extends Tool implements Breakable {

	
	//State
	private boolean gripped;	//instance scope variable
	private double weight;		//instance scope variable
	
	public static String brand = "Black and Decker" ; //static aka class variable, belongs to the class not individuals objects
	
	//No-args
	public Hammer(){
		super(); // super() is implicitly the first line of every constructor!
		System.out.println("Creating a Hammer");
		setName("hammer");
		this.type = "Club";
		setMaterial("wood");
		gripped = false;
		weight = 10.0;
	}
	
	
	@Override
	public void hammer() {
		System.out.println("Hammer Time!");		
	}


	public boolean isGripped() {
		return gripped;
	}


	public void setGripped(boolean gripped) {
		this.gripped = gripped;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return super.toString() + " Hammer [gripped=" + gripped + ", weight=" + weight + "]";
	}


	@Override
	public void breakTool() {
		System.out.println("breaking this tool");
		
	}

	@Override
	public void doWorkWithTool() {

		System.out.println("hammering doing work with tool");
		
	}
	
}
