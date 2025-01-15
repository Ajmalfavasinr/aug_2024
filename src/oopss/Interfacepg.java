package oopss;




interface car2
{
	public void Speedlimit();
	public void accelaration();
	
	
	
	
	
}





class Punch implements car2
{
	public void accelaration() {
	}
	{
		
		System.out.println("tata punch accelaration limit");
		
	}
	
	@Override
	public void Speedlimit() {
		System.out.println("tata punch speed limit is 150 kmphrs");
		
	}

	
	class Nissan implements car2
	{

		@Override
		public void Speedlimit() {
			System.out.println("nissan speed limit is 120kmpr");
			
		}

		@Override
		public void accelaration() {
			System.out.println("nissan accelatin speed limit");
			
		}
		
		
	}
	
	
}


public class Interfacepg {

	public static void main(String[] args) {
		Punch me1=new Punch();
		me1.accelaration();
		me1.Speedlimit();
		Nissan me2=new Nissan();
		

	}

}
