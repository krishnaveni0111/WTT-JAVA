package workout;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
     
        sb.append(" World!");
        
        String result = sb.toString();
        System.out.println(result);
    }
}
