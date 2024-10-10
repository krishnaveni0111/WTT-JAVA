package array.com.in;

import java.util.Scanner;

public class Multidimen {

	public static void main(String[] args) {

		        System.out.print("Enter the number of rows: ");
		        Scanner sc=new Scanner(System.in);
		        int rows = sc.nextInt();
		        System.out.print("Enter the number of columns: ");
		        int cols = sc.nextInt();

		        
		        int[][] a = new int[rows][cols];

		    
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print("Element at [" + i + "][" + j + "]: ");
		                a[i][j] = sc.nextInt(); 
		            }
		        }

		      
		        System.out.println("The elements of the array are:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(a[i][j] + " ");  
		            }
		            System.out.println();  
		        }

		      
		    }
		

	}


