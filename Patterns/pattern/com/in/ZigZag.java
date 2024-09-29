package pattern.com.in;

public class ZigZag {
    public static void main(String[] args) {
        int n = 9, count = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print(count++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
