package com.jonny.practice;


public class BST {

	public static void main(String[] args) {

		//create the root node
		TreeNode<Integer> root = new TreeNode<Integer>(60);
		
		//create the left child node
		root.left = new TreeNode<Integer>(55);
		
		//create the right child node
		root.right = new TreeNode<Integer>(100);
		
		
		
		
	}
}
	/*
	public  boolean search(E element) {
		TreeNode<E> current = root;
		
		while(current != null) {
			if(element < current.element) {
				current = current.left;  //go left
			}
			else if (element > current.element) {
				current = current.right //go right
			}
			else //element matches current.element
				return true;
		}
		
	}
	*/


