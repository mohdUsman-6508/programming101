package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativepostorder {
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
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2=new Stack<>();

        st1.push(root);

        while(!(st1.isEmpty())){
            root=st1.pop();
            st2.push(root);
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st1.push(root.right);
        }

        while(!st2.isEmpty()){
            list.add(st2.pop().data);
        }

        for(int val:list){
            System.out.print(val+" ");
        }
    }
}
