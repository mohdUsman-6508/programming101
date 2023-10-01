package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Questions {

    /// reverse a QUEUE
    public static Queue<Integer> reverseQ(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (q.size() > 0) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        return q;
    }
    ///////////////

    ///////// reverse first k elements in the queue

    public static Queue<Integer> reverseK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        for (int i = 0; i < k; i++) {
            q.add(st.pop());
        }

        int revEl = q.size() - k;
        while (revEl-- > 0) {
            q.add(q.remove());
        }

        return q;
    }

    /////////// reorder the queue

    public static Queue<Integer> reorder(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        while (st.size() > 0) {
            q.add(st.pop());
        }

        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
            q.add(q.remove());
        }

        while (q.size() > 0) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        return q;
    }

    /////////////////////

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        reorder(q);
        System.out.println(q);
//        reverseQ(q);
//        System.out.println(q);
//        reverseK(q,5);
//        System.out.println(q);

    }
}
