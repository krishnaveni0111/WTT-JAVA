package string.com.in;

import java.util.Scanner;

public class WORK3 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string length is even or odd
        if (inputString.length() % 2 == 0) {
            // If length is even, convert the string to uppercase
            System.out.println("Length is even, converting to uppercase: " + inputString.toUpperCase());
        } else {
            // If length is odd, reverse the string
            String reversedString = "";
            for (int i = inputString.length() - 1; i >= 0; i--) {
                reversedString += inputString.charAt(i);
            }
            System.out.println("Length is odd, reversing the string: " + reversedString);
        }

        // Close the scanner
        scanner.close();
    }
}
