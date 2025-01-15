package array;

import java.util.Scanner;

public class Arraypg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size ");
		int ar_size=sc.nextInt();
		int [] arr=new int[ar_size];
		int sum=0;
		System.out.println("enter the number ");
		   for (int i=0;i<ar_size;i++)
		   {
			   arr [i]=sc.nextInt();
			   sum=sum+arr[i];
		   }
			   System.out.println("sum="+4sum);
			   System.out.println("average="+sum/ar_size);
		   }
		
			
		
	}


