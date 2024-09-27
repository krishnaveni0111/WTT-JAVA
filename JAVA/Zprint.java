package anu.com.in;

public class Zprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==2&&j==4||i==3&&j==3||i==4&&j==2||i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==4||i==5&&j==5) {
					System.out.print( "*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
