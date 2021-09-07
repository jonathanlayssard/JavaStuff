package com.jonny.practice;

public class Search {

	public static void main(String[] args) {
		int[] linear_array = {1,1,4,1,2,3,3,9,15,6};
		int[] binary_array = {2,3,4,5,6,7,8,9,10,11};
		int key = 1;
		
		System.out.println(binarySearch(binary_array, key));
		System.out.println(linearSearch(linear_array, key));
		
		
	}
	
	
	public static int linearSearch(int[] list, int key) {
		
		for(int i = 0; i < list.length; i++) {
			if(key == list[i])
				return i;
			
		}
		return -1;
	}
	
	
	
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		System.out.println(high);
		
		while(high >= low) {
			int mid = (high - low) /2;
			if(key < list[mid]) {
				high = mid - 1;
			}
			else if(key == list[mid]) {
				return mid;
			}
			else {
				low = mid  + 1;
			}
			
		}
		return low - 1;
	}
	

}
