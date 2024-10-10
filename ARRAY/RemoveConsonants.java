package array.com.in;
import java.util.Scanner;

public class RemoveConsonants {

    public static void main(String[] args) {
        String a = "good morning"; 
        String result = "";              
        
        
        for (int i = 1; i < a.length(); i++) {
            char ch = a.charAt(i);  
            
           
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
               ||ch==' ' ) {
                result = result+ch;
            }
        }

      
        System.out.println("String after removing consonants: " + result);
    }
}
