package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativeinorder {
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
        Stack<Node> ds = new Stack<>();

        while(true){

            if(root!=null){
                ds.push(root);
                root=root.left;
            }
            else{
                if(ds.isEmpty()) break;
                else{
                    root=ds.pop();
                    list.add(root.data);
                    root=root.right;
                }
            }

        }

        for(int val:list){
            System.out.print(val+" ");
        }

    }
}
