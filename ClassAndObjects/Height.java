package com.objectclass.assignment;

import java.util.Scanner;

public class Height {
	
	private double feet;
	private double feet2;
	private double inches;

	public Height() {
		super();
	}

	public Height(double feet, double feet2) {
		super();
		this.feet = feet;
		this.feet2 = feet2;
	}
	public static void main(String[] args) {
				
		Height h = new Height(5.2, 5.8);
		h.display();
	}
	public void display() {
		double result=feet+feet2;
		System.out.println("Your Total height in feet is: " +result +"feet");
		System.out.println("Your Height in inches is : "+result*12 +"inches");
	}
}
