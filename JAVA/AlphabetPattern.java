package anu.com.in;

public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='a';
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+ " ");
			}
			System.out.println(" ");
		}

	}

}
