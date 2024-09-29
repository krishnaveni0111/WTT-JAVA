package pattern.com.in;

public class AlphabetJ {
    public static void printJ() {
        int n = 7; 

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                
                for (int j = 0; j < n - 1; j++) {
                    System.out.print("* ");
                }
            } else if (i < n - 1) {
               
                System.out.print("      *"); 
            } else {
                
                for (int j = 0; j < n - 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printJ();
    }
}
