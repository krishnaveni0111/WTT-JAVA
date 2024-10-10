package array.com.in;

import java.util.Scanner;

public class DecimalToBinary {

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();  // To store binary result

        // Loop until decimal becomes zero
        while (decimal > 0) {
            int remainder = decimal % 2;  // Get remainder (either 0 or 1)
            binary.insert(0, remainder);  // Insert at the beginning of the string
            decimal = decimal / 2;  // Divide decimal by 2 for the next iteration
        }

        // If the number is 0, return "0"
        if (binary.length() == 0) {
            return "0";
        }

        return binary.toString();  // Convert StringBuilder to String and return
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();  // Read input from user

        // Convert decimal to binary and display the result
        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);
    }
}

		
		

	


