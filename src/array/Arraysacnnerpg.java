package array;

import java.util.Scanner;

public class Arraysacnnerpg {
	 public static void main(String [] args) {
		 
		 
		 

	int[] ar=new int [3];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
	for (int i=0;i<3;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("enter numbers are :");
	for (int i=0;i<3;i++)
	{
		System.out.println(ar[i]);
	}
}
}
