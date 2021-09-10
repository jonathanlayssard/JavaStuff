package com.revature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.revature.pojo.Student;
import com.revature.util.StudentGpaComparator;

public class Driver {
	
	/*
	 * Collection: grouping of objects, introduced 1.2
	 * 
	 * Def: List is a group of objects that retain their insertion order
	 * 		-ArrayList vs Vector = vectors are synchronized IQ
	 * 		-LinkedList vs ArrayList = own answer
	 * 		-Stack					 = own answer
	 * 		-Queue					 = own answer
	 *  Important methods, e.g. name 5 methods found in each type of Collection
	 * 
	 * 
	 * Def: Set is a group of distinct objects that don't retain their insertion order
	 * 
	 * Def: Non-Collection, Collection called Map: key/value pairs, Maps do not extend from Collection and Iterable
	 * 
	 */
	
	
	public static void main(String[] args) {
		Challenge singleton = Challenge.getInstance();
		Challenge singleton2 = Challenge.getInstance();
		
		singleton.setAge(50);
		singleton2.setAge(20);
		System.out.println(singleton.getAge());
		System.out.println(singleton2.getAge());
		
		Student john = FactoryPattern.createStudent();//student requires a lot of meta data to be created
		
	}
	
	
	
	public void sortingObjects(){
		List<Student> myArray = new ArrayList<>();
		Student john = new Student(1, "john", 3.0);
		Student tom = new Student(5, "tom", 4.0);
		Student ben = new Student(4, "ben", 2.1);
		Student steve = new Student(10, "steve", 5.0);
		
		myArray.add(john);
		myArray.add(tom);
		myArray.add(ben);
		myArray.add(steve);
		myArray.sort(null); // introduced in 1.8 and is better optimized
		
		//Older and slower
//		Collections.sort(myArray); //Most IQ are looking this but it is slower
		System.out.println("List: " + myArray);
	}
	
	
	
	
	
	public void mapExample(){
		/*
		 * HashMap
		 */
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Steve");
		hashMap.put(2, "john");
		hashMap.put(17, "Mark Z");
		hashMap.put(5, "Tom M");
		hashMap.put(10, "Courtney");
		hashMap.put(10, "Katie");
		hashMap.put(12, "Courtney");
		
		System.out.println("HashMap: " + hashMap);
		System.out.println("HashMap size: " + hashMap.size());
		System.out.println("HashMap single element: " + hashMap.get(5));
		System.out.println("HashMap single element: " + hashMap.get(99));
		
		for(Integer i : hashMap.keySet()){
			System.out.println(i); //only have access to the key
			hashMap.get(i);
		}
		
		for(Entry<Integer, String> entry :  hashMap.entrySet()){
			System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
		}
	}
	
	
	
	public void setExample(){
		Set<Integer> hashSet = new HashSet<>(); //sorted based on hashing, aka random
		hashSet.add(5);
		hashSet.add(5);
		hashSet.add(2);
		hashSet.add(17);
		hashSet.add(6);
		
		System.out.println("HashSet: " + hashSet);
		System.out.println("HashSet Size: " + hashSet.size());
		
		
		Set<Integer> treeSet = new TreeSet<>(); //sorted on the value
		treeSet.addAll(hashSet);
		
		System.out.println("TreeSet: " + treeSet);
	}
	
	
	
	//List Example, raw list 
	public void listExample(){
				// <> Diamond syntax, introduced in 1.7
		List<String> myArray = new ArrayList<>(); //Bad
		myArray.add("hello");
		//myArray.add(5); //Compile time Datatype safety 
		myArray.add("12");
		myArray.add("world");
		myArray.add("cat");
		
		
		Iterator<String> iter = myArray.iterator();
		while(iter.hasNext()){
		System.out.println(iter.next());
}

	}

}
