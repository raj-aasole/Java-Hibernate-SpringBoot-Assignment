package com.training.strings.assign;

import java.util.Scanner;

public class Alphabets {
	
	//Ascending & Descending
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String a =sc.next();
	        char [] ch=a.toCharArray();
	        char temp =0;
	        for(int i=0;i<ch.length;i++)
	        {
	            for(int j=0;j<ch.length;j++)
	            {
	                if(ch[i]>ch[j])
	                {
	                    temp=ch[i];
	                    ch[i]=ch[j];
	                    ch[j]=temp;
	                }
	             }
	        }
	        System.out.print("String after sorting charecter in Desending order:  ");
	        for(int i =0;i<ch.length;i++)
	        {
	            System.out.print(ch[i]);
	        }
	        }
	}
