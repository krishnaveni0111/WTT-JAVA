package anu.com.in;

public class M implements Payment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M s=new M();
		s.online();
		s.direct();

	}

	@Override
	public void online() {
		// TODO Auto-generated method stub
		System.out.println("use gpay,phonepay");
		System.out.println("Pay a bill\r\n"
				+ "Open Google Pay .\r\n"
				+ "At the bottom of the screen, swipe up.\r\n"
				+ "Tap New.\r\n"
				+ "Type in the name of a biller.\r\n"
				+ "From the search results, tap the name of the biller. Make payment.\r\n"
				+ "Select an account. ...\r\n"
				+ "You can choose from multiple bill options depending on the biller. ...");
		
	}

	@Override
	public void direct() {
		// TODO Auto-generated method stub
		//System.out.println(------------------------------------------------------------);
System.out.println("Cash payment");
System.out.println("A payment can be made in the form of cash, check, wire transfer, credit card, or debit card. ");
		
	}

}
