package anu.com.in;

public class Kprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=1;i<=n;i++) {
			System.out.println("*");
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j==4||i==2&&j==3||i==3&&j==2||i==4&&j==1||i==5&&j==1||i==6&&j==2||i==7&&j==3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
		}
		

	}

}
