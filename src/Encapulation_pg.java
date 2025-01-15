class Employeenew{
	
	private String emplname;
	private int empid;
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	
	
	
	
	
}
		












public class Encapulation_pg {

	public static void main(String[] args) {
		
		Employeenew obj=new Employeenew();
		obj.setEmpid(10002);
		obj.setEmplname("rajuuuuioo");
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmplname());
			
	
		
		
	}

}
