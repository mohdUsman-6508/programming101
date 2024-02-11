import java.util.Stack;

// This is looking like a magic at first, second , third ... sight.
public class rec_6 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(-2);
        st.push(13);
        st.push(-4);
        st.push(-5);
        st.push(16);
        st.push(7);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }


    private static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int temp = st.pop();
        reverse(st);
        insert(st, temp);
    }

    private static void insert(Stack<Integer> st, int temp) {
        if (st.isEmpty()) {
            st.push(temp);
            return;
        }
        int val = st.pop();
        insert(st, temp);
        st.push(val);
    }
}
