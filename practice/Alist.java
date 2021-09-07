package com.jonny.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Alist {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(0,10);
		arrayList.add(3,10);
		
		System.out.println("A list of integers in the array list:");
		System.out.println(arrayList);
		
		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		
		System.out.println("Display the linked list forward:");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("Display the linked list backward:");
		listIterator = linkedList.listIterator(linkedList.size());
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		
		
		
		
		
		
		
		/*
		ArrayList<String> collection1 = new ArrayList<String>();
		collection1.add("New York");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Madison");
		System.out.println("A list of cities in a collection");
		System.out.println(collection1);
		
		Iterator<String> iterator = collection1.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		System.out.println();
		
		*/
		
		

		/*
		System.out.println("\nIs Dallas in collection1: " + collection1.contains("Dallas"));
		
		// remove a index from list
		collection1.remove("Dallas");
		System.out.println("\n" + collection1.size() + " cites are in collection1 now");
		
		ArrayList<String> collection2 = new ArrayList<String>();
		collection2.add("Seatle");
		collection2.add("Portland");
		collection2.add("Los Angeles");
		collection2.add("Atlanta");
		
		System.out.println("\nA list of cities in collection2:");
		System.out.println(collection2);
		
		ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
		c1.addAll(collection2);
		System.out.println("\nCities in collection1 and collection2: ");
		System.out.println(c1);
		
		c1 = (ArrayList<String>)(collection1.clone());
		c1.retainAll(collection2);
		System.out.println("\nCities in collection1 and collection2: ");
		System.out.println(c1);
		
		c1 = (ArrayList<String>)(collection1.clone());
		c1.removeAll(collection2);
		System.out.println(c1);
		*/
	}

}
