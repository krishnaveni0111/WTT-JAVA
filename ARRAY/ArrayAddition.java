package array.com.in;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6}};
		int [][]b= {{5,6,7},{8,9,10}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
