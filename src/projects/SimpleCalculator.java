package projects;

public class SimpleCalculator {

	public static void main(String[] args) {

int x=125;
int y=5;
String opp_1="+";
 
switch (opp_1) {

 case "*":System.out.println(x*y);
 break;
 case "+":System.out.println(x+y);
 break;
 case "-":System.out.println(x-y);
 break;
 case "/":System.out.println(x/y);
 default:System.out.println("Wrong Choice");
 
 
 }

	}

}
