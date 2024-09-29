package pattern.com.in;

public class ReverseFloyd {
    public static void main(String[] args) {
        int n = 5, num = n * (n + 1) / 2;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
