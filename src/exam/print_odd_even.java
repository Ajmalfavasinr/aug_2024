package exam;

public class print_odd_even {

	
	public static void main(String[] args) {
		int[] num= {1,4,5,6,7};
		
		
		System.out.println("even number");
		
		for(int number :num){
			if (number%2==0) {
			
			
			System.out.print(number +" ");}
			
		}
		System.out.println();
		System.out.println("odd numbers");
		for (int number : num) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

			
			
			
		}

		}

	
	
	

