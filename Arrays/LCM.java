package com.array.master.assign;

public class LCM {
	
	public static int LCM(int a, int b){
	    
	    if(b == 0)
	      return a;
	    
	    return LCM(b, a%b);
	  }
    
    public static void main(String[] args) {
    	  
    		    int array[] = {14,28,56,112};
    		    
    		    int lcm = array[0];
    		    int gcd = array[0];
    		 
    		    for(int i=1; i<array.length; i++){
    		     gcd = LCM(array[i], lcm);
    		      lcm = (lcm*array[i])/gcd;
    		    }
    		    
    		    System.out.println("LCM: "+lcm);
    		  }
    		 
    		  
    		}