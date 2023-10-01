package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postOrder1stack {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        List<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root==null) return;

        while (root != null || !st.isEmpty()) {

            if (root != null) {
                st.push(root);
                root = root.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    list.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        list.add(temp.data);
                    }
                } else root = temp;
            }
        }


        for (int val : list) {
            System.out.println(val);
        }
    }
}
