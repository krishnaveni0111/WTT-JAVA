package pattern.com.in;

import java.util.Scanner;

public class DoubleHill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            // Print leading spaces for centering the pattern
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }

            // Print left hill
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces between the two hills
            for (int j = 1; j <= (a - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print right hill
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after printing the row
            System.out.println();
        }
        sc.close();
    }
}
