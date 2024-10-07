package string.com.in;

import java.util.Scanner;

public class WORK4 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Swap the strings
        String temp = firstString;
        firstString = secondString;
        secondString = temp;

        // Reverse and print the swapped strings
        System.out.println("Reversed swapped first string: " + reverseString(firstString));
        System.out.println("Reversed swapped second string: " + reverseString(secondString));

        // Close the scanner
        scanner.close();
    }

    // Method to manually reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
