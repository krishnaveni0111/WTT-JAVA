package pattern.com.in;

public class VShape {

    static void pattern(int n) {
        int i, j;

        for (i = n - 1; i >= 0; i--) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 1; j < (i * 2); j++)
                System.out.print(" ");
            if (i >= 1)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}
