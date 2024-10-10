package array.com.in;



import java.util.Scanner;

public class PositiveNumbersArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

       
        System.out.println("Enter  numbers positive and negative:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        
        int positiveCount = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            }
        }

        int[] positiveNumbers = new int[positiveCount];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > 0) {
                positiveNumbers[index++] = numbers[i];  
            }
        }


        int[] reversedArray = new int[positiveCount];
        for (int i = 0; i < positiveCount; i++) {
            reversedArray[i] = positiveNumbers[positiveCount - 1 - i];  
        }

       
        int sum = 0;
        for (int num : reversedArray) {
            sum += num; 
        }

       
        System.out.println("Positive numbers: ");
        for (int num : positiveNumbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nReversed positive numbers: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum of the reversed positive numbers: " + sum);
    }
}
