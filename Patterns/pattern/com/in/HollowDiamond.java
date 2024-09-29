package pattern.com.in;

public class HollowDiamond {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < (2 * i - 1); j++) {
                if (i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < (2 * i - 1); j++) {
                if (i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(8);
    }
}
