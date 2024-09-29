package pattern.com.in;
public class AlphabetDiamond {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A';

        
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

      
        ch = (char) ('A' + rows - 2);
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch--;
            System.out.println();
        }
    }
}
