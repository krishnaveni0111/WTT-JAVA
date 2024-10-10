package array.com.in;

import java.util.Scanner;

public class StringMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        sc.nextLine(); 

       
        String[][] matrix = new String[rows][cols];

       
        System.out.println("Enter the strings for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter string for position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextLine();
            }
        }

      
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");  
            }
            System.out.println();  
        }

        sc.close();
    }
}
