package com.training.strings.assign;

import java.util.Scanner;

public class First {
	
	//Two Strings & Index
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");//Rohit
		String a=sc.nextLine();
		
		System.out.println("Enter 2nd String");//rat
		String b=sc.nextLine();
		System.out.println("Enter Index");//2-> Rohratit
		int c=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(a);  
		sb.insert(c,b);
		
		System.out.println(sb);
		
	}
	
	
		
		
	

}
