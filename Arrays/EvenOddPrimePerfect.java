package com.array.master.assign;

public class EvenOddPrimePerfect {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		//Even
		System.out.println("Even Numbers are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0){    
				System.out.println(arr[i]);
			}
		}
		
		//Odd
		System.out.println("Odd numbers");
		for(int j=0; j<arr.length;j++) {
			if(arr[j]%2!=0) {
				System.out.println(arr[j]);
			}
		}
		
		//Prime Number
		System.out.println("Prime Numbers");
		for(int i=2; i<arr.length; i++){
			boolean isPrime = true;
			
			for (int j=2; j<i; j++){
				if(i%j==0){
					isPrime = false;
	                break;	
				}
			}
			if (isPrime)
			System.out.println(i);
		}
		
		
		//Perfect Number
		System.out.println("Perfect Number");
		int sum=0;
	    for (int i = 2; i * i <= arr.length; i++)
	    {
	        if (arr[i] % i==0)
	        {
	            if(i * i != arr[i])
	                sum = sum + i + arr[i] / i;
	            else
	                sum = sum + i;
	        }
	        if (sum == arr[i] && arr[i] != 1) {
	        	System.out.println(i);
	    }
	    
	    	
	    }
	    
		
		
	}
}
	

