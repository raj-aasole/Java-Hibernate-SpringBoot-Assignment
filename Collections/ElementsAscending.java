package com.collection.framework.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsAscending {
	
	public static void main(String[] args) {
		ArrayList<Integer>List=new ArrayList<Integer>();
		
		List.add(23);
		List.add(13);
		List.add(22);
		List.add(7);
		List.add(6);
		List.add(3);
		List.add(91);
		List.add(2);
		
		 System.out.println("Given Order: ");
	        for (int i=0; i<List.size(); i++)
	            System.out.println(List.get(i));
	 
	     Collections.sort(List);
		System.out.println("Ascending Order:");
		for (int i=0; i<List.size(); i++) {
			System.out.println(List.get(i));
		}
		}
}
