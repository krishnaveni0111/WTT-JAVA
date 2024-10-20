package krishna.com.in;

import java.util.Scanner;

public class Palintrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        int originalNum = n;
        int reverse = 0;
        int remainder;

        
        while (n != 0) {                                                  
            remainder = n% 10;  
            reverse = reverse * 10 + remainder;  
            n =n/ 10; 
        }

       
        if (originalNum == reverse) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        
        sc.close();
    }
}

