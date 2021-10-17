package com.greatlearning.assignment.transactions.bst;

public class MergeSort {
	
    public static void sort(Integer[] element, int low, int high) {
    	
    	if(low < high) {
    		
    		int mid = (low + high)/2;
    		sort(element, low, mid);
    		sort(element, mid+1, high);
    		merge(element, mid, low, high);
    		
    	}
    }
    
    static void merge(Integer[] element, int mid, int low, int high) {
    	
    	int n1 = mid - low + 1;
    	int n2 = high - mid;
    	
    	int[] left = new int[n1];
    	int[] right = new int[n2];
    	
    	for(int i=0; i<n1; i++) {
    		left[i] = element[low+i];
    	}
    	
    	for(int i=0; i<n2; i++) {
    		right[i] = element[mid+1+i];
    	}
    	
    	int i=0, j=0, k=low;
    	
    	for(;i<n1 && j<n2; k++) {
    		
    		if(left[i] <= right[j]) {
    			
    			element[k] = left[i];
    			i++;
    		}
    		else {
    			
    			element[k] = right[j];
    			j++;
    		}
    			
    	}
    	
    	while(i<n1) {
    		
    		element[k] = left[i];
    		i++;
    		k++;
    	}
    	
        while(j<n2) {
    		
    		element[k] = right[j];
    		j++;
    		k++;
    	}
        
    }

}
