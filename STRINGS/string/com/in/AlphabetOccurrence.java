package string.com.in;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphabetOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string of alphabets: ");
        String input = scanner.nextLine().toLowerCase(); 

        
        Map<Character, Integer> frequencyMap = new HashMap<>();

       
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { 
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        
        System.out.println("Occurrences of each alphabet:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

       
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

      
        if (maxCount > 0) {
            System.out.println("The alphabet with maximum occurrence is: '" + maxChar + "' with " + maxCount + " occurrences.");
        } else {
            System.out.println("No alphabets found in the input string.");
        }

        scanner.close();
    }
}
