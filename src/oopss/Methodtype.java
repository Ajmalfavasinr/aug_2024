package oopss;

public class Methodtype {

	public static void main(String[] args) {
	Methodtype obj=new Methodtype();  
	obj.add();
	System.out.println(obj.sub());
	obj.mul(100,2);
	System.out.println(obj.div(100, 50));

	}
//method without return type and parameter 
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	// method with return type and without parameter 
	public int sub()
	{
	int	e=50,d=40;
	int f=e-d;;
	return f;
	
	}
	//method without return type and with parameter 
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	//method with return type and with parameter 
	public double div(int a,int b)
	{
		double c=a/b;
		return c;
	}
}
