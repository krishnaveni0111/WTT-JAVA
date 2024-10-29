package workout;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
     
        sb.append(" World!");
        
        String result = sb.toString();
        System.out.println(result);
    }
}
