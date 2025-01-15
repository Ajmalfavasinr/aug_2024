package oopss;

public class Employee {
	int empid;
	String empname;
	int Salary;
	static String CompanyName="luminooor";
	
	
	
	
	

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.empid=10002;
		emp1.empname="ajmal";
		emp1.Salary=12000;
		
		Employee emp2=new Employee();
		emp2.empid=10003;
		emp2.empname="ajmal favas";
		emp2.Salary=13000;
		System.out.println(CompanyName);
		
	}

}
