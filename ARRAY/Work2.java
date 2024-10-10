package array.com.in;

public class Work2 {

	public static void main(String[] args) {
	
		        int[][] matrix = {
		            {4, 2, 8},
		            {5, 9, 1},
		            {6, 7, 3}
		        };

		        int smallest = findSmallest(matrix);
		        System.out.println("The smallest number in the matrix is: " + smallest);
		    }

		    public static int findSmallest(int[][] matrix) {
		        int smallest = matrix[0][0];  
		        
		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[i].length; j++) {
		                if (matrix[i][j] < smallest) {
		                    smallest = matrix[i][j];
		                }
		            }
		        }
		        return smallest;
		    
		


	}

}
