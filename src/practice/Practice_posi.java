package practice;


import java.util.Scanner;

public class Practice_posi {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter 5 numbers");
		int arr[]= new int[5];
		for (int i=0;i<5;i++) {
			
		arr[i]=	sc.nextInt();
		}
		int pc=0;
		int neg=0;
		int zer=0;
		for (int i=0;i<5;i++) {
			
			if (arr[i]>0)
			{
				pc++;
			}
			else if  (arr[i]<0)
			{
				
				neg++;
				
			}
			else {
				zer++;
			}
			
		}
		
	


		
		
		System.out.println("count fo negative number "+neg);
		System.out.println("count of postive numeber "+pc);
		System.out.println("sount of zero  "+zer);
	}

}
