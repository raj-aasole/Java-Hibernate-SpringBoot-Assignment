package com.array.master.assign;

public class ThirdMaximum {
	
	//Third Maximum number from list of Array
	
	public static int maximumNumber(int[] a, int t){  
		int num;  
		for (int i = 0; i < t; i++)   
		        {  
		            for (int j = i + 1; j < t; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    num = a[i];  
		                    a[i] = a[j];  
		                    a[j] = num;  
		                }  
		             }  
		        }  
		       return a[t-3];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,4,2};  
		
		System.out.println("Third Largest number is: "+maximumNumber(a,6));  	  
		}
		
		//Second Largest
//		int array[]= {23,49,22,12,33,97,103};
//		int maxNumber = 0;
//		
//			//Maximum number & SecondMaximum
//		for(int i=0; i<array.length; i++)
//			if(array[i]>maxNumber) {
//				maxNumber=array[i];
//			}
//			System.out.println(array[array.length-1]);
//		}
		// return array.length-3;
}
