package exam;

public class Reverse_string {

	public static void main(String[] args) {
		
		String a="kerala";
		StringBuilder rev = new StringBuilder(a);
		StringBuffer rev2=new StringBuffer(a);
	StringBuffer c=	rev2.reverse();
	System.out.println(c);
		
	String reved=	rev.reverse().toString();
		System.out.println(reved);
				

	}

}
