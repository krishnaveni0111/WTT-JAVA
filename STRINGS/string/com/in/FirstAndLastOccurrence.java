package string.com.in;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
     
        String str = "hello,World";

     
        int firstO = str.indexOf('o');
        int lastO = str.lastIndexOf('o');

        
        int firstComma = str.indexOf(',');
        int lastComma = str.lastIndexOf(',');

        System.out.println("First occurrence of 'o': " + firstO);
        System.out.println("Last occurrence of 'o': " + lastO);
        System.out.println("First occurrence of ',': " + firstComma);
        System.out.println("Last occurrence of ',': " + lastComma);
    }
}
