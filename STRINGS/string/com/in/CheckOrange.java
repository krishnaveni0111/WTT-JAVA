package string.com.in;

public class CheckOrange {
    public static void main(String[] args) {
        
        String sentence = "this is orange juice";

      
        if (sentence.contains("orange")) {
            System.out.println("The word 'orange' is present in the sentence.");
        } else {
            System.out.println("The word 'orange' is not present in the sentence.");
        }
    }
}
