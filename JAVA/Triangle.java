package anu.com.in;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
