package com.array.master.assign;

public class duplicateNumbers {
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {1, 3, 5, 2, 6, 5, 1};
		
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]==arr[j])
				System.out.println("Duplicate numbers are: " +arr[j]);
		
		}
}
		//for(int a:j) {
		
			
		}
		
}
