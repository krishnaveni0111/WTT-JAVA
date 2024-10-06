package string.com.in;

public class StrCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		By Using equals() Method
		String s1="Sachin";
		String s2="Sachin";
		String s3=new String("Sachin");
		String s4="Saurav";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
//		By Using == Operator
		String s5="Sachin";
		String s6="Sachin";
		String s7=new String("Sachin");
		
		System.out.println(s5==s6);
		System.out.println(s5==s7);
//		CompareTo() method:
		String s8="k";
		String s9="k";
		String s10=new String("l");
		System.out.println(s8.compareTo(s9));//0
		System.out.println(s8.compareTo(s10));
		System.out.println(s9.compareTo(s10));



	}

}
