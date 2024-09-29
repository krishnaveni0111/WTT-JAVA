package pattern.com.in;

public class W {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == 1 || j == 5 || (j == 2 && i == 4) || (j == 3 && i == 3) || (j == 4 && i == 4)) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(); 
        }
    }
}
