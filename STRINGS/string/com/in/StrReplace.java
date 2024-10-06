package string.com.in;

public class StrReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myStr = "athul";
	    System.out.println(myStr.replace('l', 'p'));
	
	     String str="Moon is everywhere..twinkle twinkle little moon,how i woner what you are";
	     String reg="(?i)Moon";
	    
	     System.out.println(str.replaceAll(reg, "Star"));
	     
	     String st="athul is stupid";
	     String res="athul";
	     System.out.println(st.replaceFirst(res, "monkey"));
	   
	}

}
