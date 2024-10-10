package array.com.in;

import java.util.Scanner;

public class HCF {

   
    public static int calculateHCF(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        int hcf = calculateHCF(num1, num2);

        
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
