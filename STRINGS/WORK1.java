package string.com.in;

import java.util.Scanner;

public class WORK1 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        int evenCharCount = 0;

        
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                evenCharCount++; 
            }
        }

      
        System.out.println("Number of characters at even positions: " + evenCharCount);
        
       
        sc.close();
    }
}
