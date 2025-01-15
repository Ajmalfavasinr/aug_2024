package basicjava;

public class Operators {

	public static void main(String[] args) {
		
		//operators 
		/// arithematic operator 
		int a=123;
		int b=5;
				
			
				System.out.println("value of a+b ="+(a+b));
				System.out.println("value of a-b ="+(a-b));
			
				
				System.out.println("value  of a/b="+(a/b));
				System.out.println("valus of a*b="+(a*b));
				System.out.println("valus of a%b="+(a%b));
		///assigment operator +=,-=.=
				int c=a;
				System.out.println(c);
				System.out.println("value of a+=b="+(a+=b));
				System.out.println("value of a-=b+"+(a-=b));
				
				//// relational operator (==,>,<,>=,<=)
				
				
				System.out.println(a==b);
				System.out.println(a>b);
				System.out.println(a<b);
				System.out.println(a>=b);
				System.out.println(a<=b);
				
				
				//// logical oprator 
				
				String username="ajmalfavas";
				String Pass="123@";
				
				System.out.println(username=="ajmalfavas"&&Pass=="123@");
				System.out.println(username=="ajmalfavas"||Pass=="123@");
				System.out.println(! (username=="ajmalfava"));
				//System.out.println(pass);
				
				
				///////unary oprator 
				
				int d=5;
				System.out.println(d++); ///6
				System.out.println(++d);////6
				System.out.println(--d);///7
				System.out.println(d--);////5
				
				
				// ternary operator 
				///syntax variable =condition? exp1:exp2;
				int a1=50 ,a2=125;
				String a3=a1>a2?"a1 is greater ":"a2 is greater";
				System.out.println(a3);
				
	
	}

}
