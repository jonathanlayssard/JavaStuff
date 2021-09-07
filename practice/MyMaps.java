package com.jonny.practice;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMaps {

	public static void main(String[] args) {

		//set text in a string
		String test = "Good morning. Have a good class. " + "Have a good visit. Have Fun!";
		
		// create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		String[] words = test.split("[ \n\t\r.,;:!?(){}]");
		for(int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
		
			if(key.length() > 0) {
				if(!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		
		}
		
		
		// Get all entries into a set
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		//Get key and value from each entry
		for(Map.Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		
		/*
		// create a hash map
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 21);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);
		
		System.out.println("Display entries in HashMap");
		System.out.println(hashMap + "\n");
		
		
		//create a tree map
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
		System.out.println("Display entries in ascending order of key");
		System.out.println(treeMap);
		
		//Create a linked hash map
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(treeMap);
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Anderson", 31);
		linkedHashMap.put("Lewis", 29);
		linkedHashMap.put("Cook", 29);
		
		//Display the age for lewis
		System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
		
		System.out.println("Display entries in Linked Hash Map");
		System.out.println(linkedHashMap);
		*/
		
	}

}
