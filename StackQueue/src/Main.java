import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //stack
        System.out.println("Hello world!");
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<5;i++) st.push(i);

        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

        //queue

        Queue<Integer> q=new LinkedList<>();
        for(int i=5;i>0;i--) q.add(i);
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q.isEmpty());

        //deque
        Deque<Integer> dq=new LinkedList<>();
        for (int i=6;i<=10;i++) dq.add(i);
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println(dq.remove());
        System.out.println(dq.removeLast());
        dq.addFirst(10);
        System.out.println(dq);

    }
}