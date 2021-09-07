package com.jonny.practice;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		double[] list = {-1,9,4.5,6.6,5.7,-4.5};
		selectionSort(list);
		System.out.println(Arrays.toString(list));	
	}

	public static void selectionSort(double[] list) {
		for(int i = 0; i < list.length; i++) {
			//find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;
			
			
			for(int j = i+ 1; j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
					
				}
			}
			
			
			//swap list[i] with list[currentMinIndex if needed
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			
		}
		
		
		
		
	}
	
	public static void insertionSort(double[] list) {

		for(int i = 1; i < list.length; i++) {
			//Insert list[i] into a sorted sublist [0..i-1] so that list [0..i] i sorted
			double currentElement = list[i];
			int k;
			for(k = i -1; k >= 0 && list[k] > currentElement; k--) {
				list[k+1] = list[k];
			}
			
			//insert the current element into list[k+1]
			list[k+1] = currentElement;
		}
	}
	
	public static void bubbleSort(int[] list) {

		boolean needNextPass = true;
		for(int k = 1; k < list.length && needNextPass; k++) {
			//array may be sorted and next pass not needed
			needNextPass = false;
			for(int i =0; i < list.length - k; i++) {
				if(list[i] > list[i+1]) {
					//swap list[i] with list[i+1]
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					
					needNextPass = true;
				}
			}
		}
	}
 

}
