package BinaryTrees;

import javax.swing.undo.CannotUndoException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class allTraversal {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Pair {
        Node root;
        int num;

        Pair(Node root, int num) {
            this.root = root;
            this.num = num;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));
        if (root == null) return;

        while (!st.isEmpty()) {
            Pair it = st.pop();

            if (it.num == 1) {
                pre.add(it.root.data);
                it.num++;
                st.push(it);

                if (it.root.left != null) {
                    st.push(new Pair(it.root.left, 1));
                }
            } else if (it.num == 2) {
                in.add(it.root.data);
                it.num++;
                st.push(it);

                if (it.root.right != null) {
                    st.push(new Pair(it.root.right, 1));
                }
            } else {
                post.add(it.root.data);
            }
        }


        for (int val : pre) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int val : in) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int val : post) {
            System.out.print(val + " ");
        }


    }
}
