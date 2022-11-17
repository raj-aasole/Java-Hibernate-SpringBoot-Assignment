package com.array.master.assign;

public class AscendingDescending {
	public static void main(String[] args) {
		
		//Print N/2 in Ascending order
		int a[]= {20,8,10,4,14,12,2,18};
		System.out.println("Ascending order:");
		for(int b=0; b<a.length / 2; b++) {
			for(int c=b+1; c<a.length / 2; c++) {
				int temp=0;
				if(a[b]>a[c]) {
				temp=a[b];
				a[b]=a[c];
				a[c]=temp;
				}
			}
				System.out.println(a[b]+" ");
				}
		
		//Printing N/2 in descending order
		System.out.println("Descending Order: ");
		for(int b=a.length/2; b<a.length; b++) {
			for(int c=b+1; c<a.length; c++) {
						
			int tem=0;
			if(a[b]<a[c]) {
			tem=a[b];
			a[b]=a[c];
			a[c]=tem;
			
			}
		}
			System.out.println(a[b]+" ");
	}
	}
}
