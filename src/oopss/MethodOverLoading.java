package oopss;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj=new MethodOverLoading();
		
		obj.add();
		obj.add(10, 16);
		obj.add(100, 160);
		obj.add(25, 25);
		
		
		

	}

	public void add() {
		
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);
		
		
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
		
		
	}
	public void add(int a,double b) {
		
		double c=a+b;
		System.out.println(c);
		
		
	}
	public void add(double a,int b) {
		
		double c=a+b;
		System.out.println(c);
		
		
	}
	
	
	
	
	
}
