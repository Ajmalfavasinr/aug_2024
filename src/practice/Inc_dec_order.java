package practice;

import java.util.Scanner;

public class Inc_dec_order {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner sc =new Scanner(System.in);
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		 if(num1<num2&&num2<num3)
		 {
			 System.out.println("Increasing");
		 }
		 else if (num1>num2&&num2>num3)
		 {
			 System.out.println("Decreasing");
		 }
		 else {
			 
			 System.out.println("neither");
		 }

	}

}
