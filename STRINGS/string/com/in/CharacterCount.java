package string.com.in;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int whitespaceCount = 0;

       
        input = input.toLowerCase();

      
        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                whitespaceCount++; 
            } else if (Character.isDigit(ch)) {
                digitCount++; 
            } else if (ch >= 'a' && ch <= 'z') { 
                if ("aeiou".indexOf(ch) != -1) {
                    vowelCount++; 
                } else {
                    consonantCount++; 
                }
            }
        }

      
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of whitespace characters: " + whitespaceCount);

        scanner.close();
    }
}
