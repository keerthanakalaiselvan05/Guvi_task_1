package com.guvi.task1;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		System.out.println("Enter the purchase amount :");
	    Scanner sc=new Scanner(System.in);
		int purchaseAmount=sc.nextInt();
		int finalAmount;
		if(purchaseAmount<500)
		{
			System.out.println("No discount applied : "+purchaseAmount);
		}
		else if(purchaseAmount>=500 && purchaseAmount<1000)
		{
			finalAmount=purchaseAmount-(purchaseAmount*10/100);
			System.out.println("Final payable amount after applying 10% discount is : "+finalAmount);
		}
		else
		{
			finalAmount=purchaseAmount-(purchaseAmount*20/100);
			System.out.println("Final payable amount after applying 20% discount is : "+finalAmount);
		}
		sc.close();
	}
}
