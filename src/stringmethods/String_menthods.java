package stringmethods;

public class String_menthods {

	public static void main(String[] args) {
		
		String s1="luminor";
		String s2="Techno";
		String s3="Lab";
		String s4="luminor";
		String s7="ernakulam city ";
		String s8="city";
		//eqall 
	System.out.println(s1.equals(s4));
	//concat 
	System.out.println(s1.concat(s2));
	//e
	System.out.println(s7.contains(s8));
	//to uppercase 
	System.out.println(s7.toLowerCase());
	System.out.println(s7.toUpperCase());
	//length 
	System.out.println(s8.length());
	//start with end with 
	String s9="ernakulam";
		System.out.println(s7.startsWith(s9));
		System.out.println(s7.endsWith(s8));
		//replace 
		System.out.println(s7.replace("ernakulam", "kochi"));
		//trim
	String	s10="    ajmal    ";
		System.out.println(s10.trim());
		//substriing
		System.out.println(s9.substring(4,9));
		//split 
		String s11="Mohammed Ajmal Favas";
		String[] st=s11.split(" ");
		for(String e:st)
		{
			System.out.println(e);
			//toarraychar
			String c11="ajmal";
			char [] 
					
					
		}
		
		
		
	}

}
