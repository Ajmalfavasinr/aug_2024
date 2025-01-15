package stringmethods;

import java.util.Scanner;

public class Stringpalidrome {
	public static void main(String[] args) {
		
		System.out.println("enter a string");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("enter number is palindrome ");
		}
		else
		{
			System.out.println("enter number is not palindrome");
		}
		
		
	}
}
