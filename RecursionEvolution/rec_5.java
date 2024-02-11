import java.util.Stack;

public class rec_5 {
    //delete middle element of the stack
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);

        int k = (st.size() / 2) + 1;
        if (st.size() % 2 == 0) {
            k = (st.size() / 2);
        }
        deleteMid(st, k);
        System.out.println(st);
    }

    private static void deleteMid(Stack<Integer> st, int k) {
        if (k == 1) {
            st.pop();
            return;
        }
        int top = st.pop();
        deleteMid(st, k - 1);
        st.push(top);
    }
}
