package com.greatlearning.assignment.transactions.bst;

import java.util.ArrayList;

public class BST {
	
	public void formTree(Node root) {
		
		ArrayList<Integer> element = new ArrayList<>();
		
		storeElement(root, element);
		element.add(root.key);
		
		int size = element.size();
	
		Integer[] path = new Integer[size];
		path = element.toArray(path);
		
		MergeSort.sort(path, 0, path.length-1);
		skewed(path, root, 0);

	}
	
	boolean storeElement(Node node, ArrayList<Integer> path) {
		
		if(node == null)
			return false;
		else {
			
			if(node.left != null) {
				
				path.add(node.left.key);		
				storeElement(node.left, path);
			}
			if(node.right != null) {
				
				path.add(node.right.key);
				storeElement(node.right, path);
			}
			
			return true;
		}
	}
	
    Node skewed(Integer[] path, Node root, int count) {
		
    	int i=0;
    	Node newnode = root;
    	Node newroot = null; 	
    	
    	while(newnode != null && i<path.length) {
			
    		newroot = newnode;
			if(i == 0) {
			    newroot.key = path[i];
			    i++;
			    System.out.print(newroot.key+" ");
			    
			}
			else if(path[i] < newroot.key){
				newroot.left = new Node(path[i]);
				i++;
				System.out.print(newroot.left.key+" ");
			}
			else {
				newroot.right = new Node(path[i]);
				i++;
				System.out.print(newroot.right.key+" ");
			}
		}
    	
		System.out.println();
		return newnode;
				
	}
		
	
}
