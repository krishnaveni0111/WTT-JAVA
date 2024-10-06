package string.com.in;

public class DeleteConsonants {
    public static void main(String[] args) {
       
        String input = "hello, have a good day";

      
        StringBuilder result = new StringBuilder();

       
        input = input.toLowerCase();

        
        for (char ch : input.toCharArray()) {
            
            if ("aeiou ,".indexOf(ch) != -1) {
                result.append(ch); 
            }
        }

        
        System.out.println("String after removing consonants: " + result.toString());
    }
}
