package oopss;

import java.util.Scanner;

interface Bank
{
	public void Accdetails();
	void balance();
	void withdraw();
	void deposite();
	
	
}
class Sbi implements Bank{
	
	long ini_bal=7500;
	long	withdraw_amount;
	long acc_no;
	long after_withdraw_amount=ini_bal-withdraw_amount;
	@Override
	public void Accdetails() {
		
		
		
		
	
		System.out.println("Enter Acccount 	Number");	

		
		Scanner sc1 = new Scanner(System.in);
		long acc_no=sc1.nextLong();
		System.out.println("Welcome to Sbi Online");
		
		
		//Scanner ob=new Scanner(System.in);
			
			
			
				
				
			}
						

	@Override
	public void balance() {
		//float ini_bal=7500;
		System.out.println("Your Current Balance is " +ini_bal);
	}

	@Override
	public void withdraw  () {
		System.out.println("enter the amount to withdraw");
		Scanner sc1 = new Scanner(System.in);
	long	withdraw_amount=sc1.nextLong();
	ini_bal=ini_bal-withdraw_amount;
	
	
//long	after_withdraw_amount=ini_bal-withdraw_amount;
//System.out.println(ini_bal);
	
	
	System.out.println("Your remaining Balance is " +(ini_bal));
	
	
		
	}
	
	@Override
	public void deposite () {
	System.out.println("enter amount to deposite");
	Scanner sc1 = new Scanner(System.in);
	long dp_amount=sc1.nextLong();;
	//System.out.println(after_withdraw_amount);
	System.out.println("Remaining Account Balance is  "+(dp_amount+ini_bal));
			
			
		
	
	
	}
	
	
	
	
}





public class Bankapplication {

	public static void main(String[] args) {
	Sbi obj1=new Sbi();
	obj1.Accdetails();
	obj1.balance();
	obj1.withdraw();
	obj1.deposite();

	}

}
