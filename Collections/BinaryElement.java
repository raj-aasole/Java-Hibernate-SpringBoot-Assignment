package com.collection.framework.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryElement {

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
		
		Collections.sort(List);
		System.out.println("ArrayList is: " +List);
		int Binary = Collections.binarySearch(List, 23);
		
		System.out.println("Binary search Position is: " + Binary);
	}
}
