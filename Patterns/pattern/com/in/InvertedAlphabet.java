package pattern.com.in;
public class InvertedAlphabet {
    public static void main(String[] args) {
        int n = 5;
        char c='a';
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}   