package com.greatlearning.assignment.floorconstruction.service;

import java.util.ArrayList;
import java.util.Stack;

public class FloorConstructionService {
	
	Stack<Integer> temp = new Stack<>();
	ArrayList<Integer> pendingwork = new ArrayList<>();
	
	public void arrange(ArrayList<Integer> floorsize, int floor) {
		
		for(int j=0; j<floorsize.size(); j++) {
			
			if(floor == floorsize.get(j)) {
				
				temp.push(floorsize.get(j));
				System.out.println("\nDay : "+(j+1));
				System.out.print(temp.pop()+" ");
				    
				if(temp.isEmpty()) {
					
					floor--;
			    }
				else {
					
                    do {
                    	
                    	floor--;
						int check = temp.pop();
						
						if(check == floor) {
							
							System.out.print(check+" ");
						}
						else {
							
							temp.push(check);
							System.out.println(" ");
							break;
						}
							
					} while(temp.size()>0);
					
				}
						    
			 }
			 else {
				
				 if(temp.isEmpty()) {
					 
					 temp.push(floorsize.get(j));
					 System.out.println("\nDay : "+(j+1));
					 System.out.println(" ");
				 }
				 else {
					 
					 int check = temp.pop();
					 
					 if(check > floorsize.get(j)) {
						 
						 temp.push(floorsize.get(j));
						 temp.push(check);
						 
						 if(j == floorsize.size()-1) {
							 
							 System.out.println("\nDay : "+(j+1));
						     display(temp);
						 }
						 else {
							 
							 System.out.println("\nDay : "+(j+1));
						     System.out.println(" "); 
						 }
					 }
					 else {
						 
						 temp.push(check);
						 temp.push(floorsize.get(j));
							 
                         if(j == floorsize.size()-1) {
							 
							 System.out.println("\nDay : "+(j+1));
						     display(temp);
						 }
						 else {
							 
							 System.out.println("\nDay : "+(j+1));
						     System.out.println(" "); 
						 }
					 }
						 
				 }
				
			}
			
		}
	
	}
	
	void display(Stack<Integer> temp) {
		
		int size = temp.size();
		
		for(int i=0; i<size; i++) {
			System.out.print(temp.pop()+" ");
		}
	}
	
}
