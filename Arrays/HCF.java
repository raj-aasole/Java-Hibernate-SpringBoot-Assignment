package com.array.master.assign;

public class HCF {
	
	private static long hcf(long m, long n) {
		{
			while(n>0) {
				long temp = n;
		        n = m % n; 
		        m = temp;
		    }
		    return m;
		}
}
	public static void main(String[] args) {
		
		int array[]= {3,9};
		
		long result=0;
		for(int i = 1; i<array.length; i++)  
		{
			long hcf=0;
			result = hcf(result, array[i]);	     
		  }
		System.out.println("HCF: " +result);
}
}
