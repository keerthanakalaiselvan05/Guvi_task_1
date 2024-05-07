package com.guvi.task1;

public class Pattern {

	public static void main(String[] args) {

		//pattern program to print the given series
		int m=55555,n=1111;
		System.out.println(m);
		for(int i=1;i<5;i++)
		{
			m=m-n;
			n=n/10;			
			System.out.println(m);
		}		
	}
}

