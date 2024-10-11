package array.com.in;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ja = {
                {10, 20, 30 ,40},
                {50, 60, 70, 80, 90, 100},
                {110, 120}
                    };
		 for (int i = 0; i < ja.length; i++) {
	            for (int j = 0; j < ja[i].length; j++)
	                System.out.print(ja[i][j] + " ");
	            System.out.println();
	        }

	}

}
