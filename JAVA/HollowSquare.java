package anu.com.in;

public class HollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int m=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1||i==n||j==1||j==m) {
					System.out.print("*");
				}
				else {
					System.out.print( " ");
				}
				
			}
			System.out.println();
		}

	}

}
