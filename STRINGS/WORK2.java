package string.com.in;

import java.util.Scanner;

public class WORK2 {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);

        
        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();

        
        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();

       
        String reversedFirst = reverseString(firstString);

        // Manually reverse the second string
        String reversedSecond = reverseString(secondString);

        // Join the reversed strings
        String joinedString = reversedFirst + reversedSecond;

        // Convert the joined string to uppercase
        String result = joinedString.toUpperCase();

        // Output the result
        System.out.println("Result: " + result);

        // Close the scanner
        sc.close();
    }

    // Method to manually reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
