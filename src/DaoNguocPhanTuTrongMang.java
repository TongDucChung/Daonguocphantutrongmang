import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class DaoNguocPhanTuTrongMang {

    public static void revesseInterger(int[] n){
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < n.length; i++) {
            stack.push(n[i]);
        }
        int tem = stack.size();
        for (int i = 0; i < tem; i++) {
            n[i]=stack.pop();
        }
        for (Integer a:n) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        revesseInterger(arr);

    }



}
