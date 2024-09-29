package pattern.com.in;

public class AlphabetS {
    public static void printS() {
        int n = 7; 

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1 || (i == n / 2)) {
                
                for (int j = 0; j < n; j++) {
                    System.out.print("$ ");
                }
            } else if (i < n / 2) {
                
                System.out.print("$ ");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("$ ");
            } else {
                
                for (int j = 0; j < n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printS();
    }
}
