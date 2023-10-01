package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterationpreorder {
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
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        List<Integer> list = new ArrayList<>();
        Stack<Node> ds = new Stack<>();

        ds.push(root);
        while (ds.size() != 0) {

            Node temp = ds.pop();
            if (temp.right != null) ds.push(temp.right);
            if (temp.left != null) ds.push(temp.left);
            list.add(temp.data);

        }

        for(int val:list){
            System.out.print(val+" ");
        }
    }
}
