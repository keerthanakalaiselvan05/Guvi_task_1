package com.guvi.task1;

import java.util.Scanner;

public class PositiveNegative {
	 //check the number is positive or negative
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner Sc=new Scanner(System.in);
		int num=Sc.nextInt();
		if(num>=0)
			System.out.println("Given number is Positive");
		else
			System.out.println("Given number is Negative");
		Sc.close();
		}
	}
