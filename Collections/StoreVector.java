package com.collection.framework.assignment;

import java.util.Collections;
import java.util.Vector;

public class StoreVector {
	public static void main(String[] args) {
		
		//WAP to store data related to item in Vector and after that sort the data. 
		Vector<String> itemData=new Vector<String>();
		
		itemData.add("Soap");
		itemData.add("Comb");
		itemData.add("Powder");
		itemData.add("Lipstik");
		itemData.add("Perfume");
		itemData.add("AloveraGel");
		itemData.add("Facewash");
		
		Collections.sort(itemData);
		for(String s:itemData) {
		System.out.println(s);
		}
	}

}
