package pattern.com.in;
import java.util.Scanner;

public class ReverseEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Read an integer input

        for (int i = 1, p = (a * 2) - 2; i <= a; i++, p -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " "); // Print the even number
            }
            System.out.println(); // Move to the next line
        }

        sc.close(); // Close the scanner
    }
}
