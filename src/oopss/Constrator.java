package oopss;

import java.nio.file.spi.FileSystemProvider;

public class Constrator {
	int empid;
	String empname;
	public void display() {
		
		System.out.println();
		
	}

		
	
public Constrator(int empid,String empname)
{
	this.empid=empid;
			this.empname=empname;
}
	public static void main(String[] args) {
		Constrator obj1=new Constrator (10001,"ajmal");
		System.out.println(obj1.empname);
		System.out.println(obj1.empid);
		
	
				
				System.out.println(obj1.display);
				
				
				
	}
public void display() {
		
	
	
	
		
	}

}
