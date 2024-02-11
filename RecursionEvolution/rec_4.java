import java.util.Stack;

public class rec_4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(2);
        st.push(5);
        st.push(-1);
        st.push(1);
        st.push(3);

        System.out.println(st);sort(st);
        System.out.println(st.peek());
        System.out.println(st);
    }

    private static void sort(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int peek = st.pop();
        sort(st);
        insert(st, peek);
    }

    private static void insert(Stack<Integer> st, int peek) {
        if (st.isEmpty() || st.peek() < peek) {
            st.push(peek);
            return;
        }
        int tempPeek = st.pop();
        insert(st, peek);
        st.push(tempPeek);
    }
}
