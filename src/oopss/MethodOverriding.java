package oopss;





class father{
	
	
	
	public void phone(){
		
		System.out.println("father phone is samsung s22 ultra");
		
	}
	
}


class son extends father{
	public void phone(){
		
		System.out.println("son phone is iphone ");
		
	}
	
	
	
	
}


class son2 extends son{
	
	public void phone() {
		
		
		System.out.println("son 2 phone is realme note 9 pro");
		super.phone();
		
		
	}
			
	
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		son2 obj=new son2();
		{
			obj.phone();
			
		}
		
	}

}
