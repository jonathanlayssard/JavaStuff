package com.jonny.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
	
		//create a hash set
		Set<String> set = new HashSet<String>();
		
		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		//Tree set orders no matter the insertion order
		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("Sorted tree set: " + treeSet);
		
		//Use the methods in SortedSet Interface
		System.out.println("first(): " + treeSet.first());
		System.out.println("Last():  "+ treeSet.last());
		System.out.println("headset(\"New York\"): " + treeSet.headSet("New York"));
		System.out.println("tailset(\"New York\"): " + treeSet.tailSet("New York"));
		
		
		//Use the methods in NavigableSet interface
		System.out.println(treeSet.lower("P"));
		System.out.println(treeSet.higher("P"));
		System.out.println(treeSet.floor("P"));
		System.out.println(treeSet.ceiling("P"));
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		System.out.println(treeSet);
		
		
		
		
		/*
		Set<String> set = new LinkedHashSet<String>();
		
		//Add strings to the Linked Hash Set, insertion order is retained.
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		
		//Display the elements in the Linked Hash Set
		for(String s: set) {
			System.out.println(s.toUpperCase() + " ");
		}
		*/
		
		
		/*
		//create hash set, this prevents duplicates from being added, Hash sets are unorded
		Set<String> set = new HashSet<String>();
		
		//add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		System.out.println(set);
		
		//Display the elements in the hash set, have to use for each loop to iterate over sets 
		for(String s: set) {
			System.out.print(s.toUpperCase() + " ");
		}
		*/
		

	}

}
