package anu.com.in;

public class Shapes implements Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s=new Shapes();
		s.circle();
		s.square();

	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("its 360 degree");
	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
System.out.println("it has four sides");
		
	}

}
