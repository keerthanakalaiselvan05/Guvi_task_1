package com.guvi.task1;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Reverse the number
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int i,rev=0,rem=0;
		for(i=0;i<num;i++)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
}
