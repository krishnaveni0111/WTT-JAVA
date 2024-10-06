package string.com.in;

import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

       
        String[] nameParts = fullName.split(" ");

     
        String result = "";
        for (int i = 0; i < nameParts.length - 1; i++) {
            result += nameParts[i].charAt(0) + "."; 
        }
        result += nameParts[nameParts.length - 1];

        
        System.out.println("Abbreviated name: " + result);

        sc.close();
    }
}
