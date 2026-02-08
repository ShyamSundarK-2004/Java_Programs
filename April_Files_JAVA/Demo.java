import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter "+i+" : ");
            st.push(sc.nextInt());
        }

        int s = sc.nextInt();

        while(st.search(s)){
            st.pop();
        }

        System.out.println(st);
    }
    
}
