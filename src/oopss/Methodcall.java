package oopss;

import java.util.Scanner;

public class Methodcall {

	public static void main(String[] args) {
		Methodcall obj=new Methodcall();
		
		
		
		
		//obj.fullname();
		obj.length();
	
		
	
		
		
		

	}
	
	public String fullname() {
		Scanner sc= new Scanner(System.in);
		System.out.print("what is your first name :");
		String mname1=sc.nextLine();
		System.out.print("what is your last name :");
		String mname2=sc.nextLine();
		System.out.println("your full name is "+(mname1+mname2));
		System.out.println("your last name is "+mname2);
		return(mname1+mname2);
		
		
		
	}
	public void length() {
	String a= fullname();
	System.out.println(a.length());
	
		
		
		
		
		
		
	}
	
	

}
