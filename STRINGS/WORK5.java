package string.com.in;

import java.util.Arrays;
import java.util.Scanner;

public class WORK5 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if the two strings are anagrams
        if (isAnagram(firstString, secondString)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        // Remove all whitespace and convert strings to lowercase for accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
