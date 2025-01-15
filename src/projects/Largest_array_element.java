package projects;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_array_element {

	
	
	
	
	
	
	 static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	       
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	     
	        Arrays.sort(array);

	      
	        int largest = array[array.length - 1];

	        System.out.println("The largest element in the array is: " + largest);

	        
	 }   
	}





