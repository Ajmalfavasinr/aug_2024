package oopss;
interface Tvremote{
	
	public void volumeup();
	
		
		
		
	
	public void volumedown();
	public void poweron_off();
	
	
	
	
	
	
}
interface Smarttvrem{
	
	
	public void Googleassi();
	public void youtube();
	public void netflix();
}
	
class Tv_1 implements Tvremote,Smarttvrem

	
	

	
	
	
	

{

	@Override
	public void volumeup() {
		System.out.println("volume increase");
		
	}

	@Override
	public void volumedown() {

System.out.println("volume dec-");
		
	}

	@Override
	public void poweron_off() {
	System.out.println("to power on and off");
		
	}

	@Override
	public void Googleassi() {
		System.out.println("google voice features");
	}

	@Override
	public void youtube() {
		System.out.println("acess youtube");
		
	}

	@Override
	public void netflix() {
		System.out.println("netflix");
		
	}
	

}









public class Programetv {

	public static void main(String[] args) {
		
		

	}

}
