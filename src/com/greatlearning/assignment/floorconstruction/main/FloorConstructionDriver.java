package com.greatlearning.assignment.floorconstruction.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatlearning.assignment.floorconstruction.service.FloorConstructionService;

public class FloorConstructionDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FloorConstructionService service = new FloorConstructionService();
		
		System.out.println("Enter the total number of floors in the building!");
		int floor = sc.nextInt();
		
		ArrayList<Integer> floorsize = new ArrayList<>();
		
		for(int i=0; i<floor; i++) {
		
			System.out.println("\nEnter the floor size given on day : "+(i+1));
			floorsize.add(sc.nextInt());
		}
		
		System.out.println("\nThe order of construction is as follows :\n");
		service.arrange(floorsize, floor);
		
	    
	    sc.close();
	}

}
