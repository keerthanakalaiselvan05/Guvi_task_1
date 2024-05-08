package com.guvi.task1;

public class SmallestNumber {

		//Smallest among three numbers
		public static void main(String[] args) {
			System.out.println("Enter three numbers :");
			Scanner sc=new Scanner(System.in);
		    for(int i=0;i<3;i++)
		    {		       
		       int num_1=sc.nextInt();
		       int num_2=sc.nextInt();
		       int num_3=sc.nextInt();
		       if(num_1<num_2 && num_1<num_3)
		       {
		    	   System.out.println("Smallest number is : "+num_1);
		    	   
		       }else if(num_2<num_3)
		       {
		    	   System.out.println("Smallest number is : "+num_2);
		       }
		       else
		       {
		    	   System.out.println("Smallest number is : "+num_3);
		       }
		    }
		    sc.close();
	}
}
