package array;

import java.util.Scanner;

public class two_dimension_string_array {

	public static void main(String[] args) {
		
		
		
		
		

		          int[][] arr=new int [3][2];
		      
		        		  Scanner sc =new Scanner (System.in);
		        		  System.out.println("enter the number ");
		          for (int i=0;i<3;i++)
		          {
		        	  for (int j=0;j<2;j++)
		        	  {
		        		  arr [i][j]=sc.nextInt();
		        	  }
		        	  
		          }
		          for (int i=0;i<3;i++)
		          {
		        	  for (int j=0;j<2;j++)
		          
		        		  {
		        	  System.out.print(arr [i] [j]+" `");
		        		  }
		        	  System.out.println();
		          }
			}
		}




