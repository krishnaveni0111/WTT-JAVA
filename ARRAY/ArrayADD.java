package array.com.in;

public class ArrayADD {
	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,5,6}};
		int [][]b= {{5,6,7},{8,9,10}};
		int [][]s=new int[2][3];
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                s[i][j] = a[i][j] + b[i][j];
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

	}

}
