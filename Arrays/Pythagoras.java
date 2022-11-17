package com.array.master.assign;

import java.util.Arrays;

public class Pythagoras {
	
	static void findTriplet(int arr[], int n) 
	  { 
	    
	    for (int i = 0; i < n; i++) 
	      arr[i] = arr[i] * arr[i]; 
	    Arrays.sort(arr); 

	    
	    for (int i = n - 1; i >= 2; i--) {  // Fix a
	      int b = 0; // Fix b
	      int c = i - 1; // Fix c
	      while (b < c) { 
	        
	        if (arr[b] + arr[c] == arr[i]) {
	          System.out.printf("Triplets: %f, %f, %f\n", new Object[] {Math.sqrt(arr[b]), Math.sqrt(arr[c]), Math.sqrt(arr[i])});
	          b++;
	          c--;
	        }
	        if (arr[b] + arr[c] < arr[i]) 
	            b++; 
	          else
	            c--; 
	        } 
	      } 
	    } 
	    public static void main(String[] args) 
	    { 
	      int arr[] = { 3, 1, 4, 6, 5 }; 
	      int arr_size = arr.length; 
	      findTriplet(arr, arr_size);
	    } 
	  
}
