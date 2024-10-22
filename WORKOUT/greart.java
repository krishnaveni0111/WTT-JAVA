package workout;

public class greart {
	public static void main(String args[]) {
		int a=10;
		if(a>0) {
			if(a<1) {
				System.out.println("small positive number");
			}
			else if(a<1000000) {
				System.out.println("large positive number");
			}
			else {
				System.out.println("no number");
			
			}
		}else if(a<0) {
				if(Math.abs(a)>1) {
					System.out.println("small negative number");
				
			}
				else if(Math.abs(a)<100000) {
					System.out.println("large negative number");
				}
		}else {
			System.out.println( "zero");
		}
	}

}
