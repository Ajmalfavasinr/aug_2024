package oopss;

public class Triangle {

	public static void main(String[] args) {
		Triangle obj=new Triangle();  
		System.out.println(obj.circle(4));
		System.out.println("area of rec "+obj.rec());
	obj.squ(6);
	obj.triangle();
	
		
	}
	public void triangle() {
		
	
	int b=10;
	int h=5;
	double	tri=0.5*b*h;
	System.out.println(tri);
	}
	public int rec()
	{
		int l=10;
		int b=20;
		int re=l*b;
		return(re);
	}
	public void squ(int a)
	{
		int c=a*a;
		System.out.println(c);
	}
	
	public double circle(int r)
	{
		
		double c=3.14*r*r;
		return(c);
	}
}
