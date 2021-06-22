import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String s1="hello ae trong lop";
        String[] words=s1.split("\\s");
//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//        }
        Stack<String>strings=new Stack<>();
        for (int i = 0; i < words.length; i++) {
            strings.push(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            words[i]=strings.pop();
        }
        for (String a:words) {
            System.out.println(a);
        }
    }
}
