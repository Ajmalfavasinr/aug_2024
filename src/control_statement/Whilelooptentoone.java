package control_statement;

public class Whilelooptentoone {

	public static void main(String[] args) {
		int n=11553;
		int r,s=0;
		int temp=n;
		
		while (n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
			
		}
		  
		if(temp==s)
		{
			System.out.println("amstong" );
			
		}
		else 
		{
			System.out.println("not amstrong");
		}
		  
		   
		
			
		
		
		

	}

}
