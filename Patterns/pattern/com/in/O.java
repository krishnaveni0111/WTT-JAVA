package pattern.com.in;


public class O {

	public static void main(String[] args) {
		int a =5;
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print(" O");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}
}