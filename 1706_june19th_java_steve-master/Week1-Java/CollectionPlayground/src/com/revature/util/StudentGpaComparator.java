package com.revature.util;

import java.util.Comparator;

import com.revature.pojo.Student;

public class StudentGpaComparator implements Comparator<Student>{

	/*
	 *  Comparable: natural/default ordering/sorting
	 *  Comparator: additional/alternate sorting available - unnatural 
	 */
	
	@Override
	public int compare(Student o1, Student o2) {
		double oGpa1 = o1.getGpa();
		double oGpa2 = o2.getGpa();
		
		if(oGpa1 > oGpa2){
			return 1; //positive
		}else if(oGpa1 < oGpa2){
			return -1; //Negative
		}else{
			return 0; //the objects are equal
		}
		
		
	}

}
