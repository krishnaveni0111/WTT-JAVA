package pattern.com.in;

import java.util.Scanner;

public class EvenPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int a = sc.nextInt();
        for (int i = 1, p = 0; i <= a; i++, p += 2) {
            for (int k = 0; k < a - i; k++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " "); 
            }
            System.out.println(); 
        }
        sc.close(); 
    }
}
