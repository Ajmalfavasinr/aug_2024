package oopss;

 class Members12{
	
		public void printdetails()
		{
			
	   String name="ajmal";
		int age= 22;
		 long phone_no=8281906217l;
		String	adress="kaloor,ernakulam";
		int	salary=17000;
		System.out.println("name ="+name);
		System.out.println("age ="+age);
		System.out.println("phone number ="+phone_no);
		System.out.println("addres ="+adress);
		System.out.println("salary ="+salary);
			
		}


 }

class employee12 extends Members12{
	public void employeeDetails()
	{
String	spec="junoir";
String dep="testing";

System.out.println("employee details ");
System.out.println("specialisation="+spec);
System.out.println("department ="+dep);
	}
	}

class Manager extends Members12{
	
	
	public void Mangersdet()
	{
		String mem="Senior";
		String dep="HR MANAGER";
		System.out.println("manager detsils");
		System.out.println("specialisation="+mem);
		System.out.println("department="+dep);
	}
		
		
		
	
	

	
	
	
		
		
		
		
	}
	
	
	
	
	
	

	
	
	
	 class Project11{

	public static void main(String[] args) {
		employee12 sc= new employee12();
		sc.employeeDetails();
		sc.printdetails();
				
				

	}

}
