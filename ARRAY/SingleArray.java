package array.com.in;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]	=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter  the element at "+i+" position");
			a[i]=sc.nextInt();
		}
		 System.out.println("The elements of the array are:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(a[i] + " ");  
	        }
		

	}

}
