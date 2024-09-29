package pattern.com.in;


public class Y {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == 3 && i != 1 && i != 2 || 
                    i == 1 && j == 1 || 
                    i == 1 && j == 5 || 
                    i == 2 && j == 2 || 
                    i == 2 && j == 4) {
                    System.out.print("Y ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
