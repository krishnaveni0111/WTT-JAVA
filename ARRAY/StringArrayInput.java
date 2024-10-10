package array.com.in;

import java.util.*;

public class StringArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  

        
        String[] strings = new String[n];

     
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }


        System.out.println("\nYou entered:");
        for (String str : strings) {
            System.out.println(str);
        }

        sc.close();
    }
}
