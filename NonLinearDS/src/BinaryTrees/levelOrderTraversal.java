package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
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
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        List<List<Integer>> finalAns = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();

        qu.offer(root);
        while (qu.size() != 0) {
            int levelNum = qu.size();
            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i < levelNum; i++) {
                Node temp = qu.poll();
                if (temp.left != null) qu.offer(temp.left);
                if (temp.right != null) qu.offer(temp.right);
                ans.add(temp.data);
            }
            finalAns.add(ans);
        }

        for (List a : finalAns) {
            System.out.print(a + " ");
        }


    }
}
