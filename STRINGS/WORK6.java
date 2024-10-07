package string.com.in;

import java.util.Scanner;

public class WORK6 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
            // Count and print the number of vowels if the string is a palindrome
            int vowelCount = countVowels(inputString);
            System.out.println("Number of vowels in the string: " + vowelCount);
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase(); // Remove spaces and convert to lowercase
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to count the vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for easier comparison
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
