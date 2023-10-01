package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversalRecursive {
    public static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);

        root.right=new Node(3);
        root.right.right=new Node(8);
        root.right.right.right=new Node(10);
        root.right.left=new Node(7);
        root.right.right.left=new Node(9);

        List<Integer> ds=new ArrayList<>();
        preOrder(root,ds);

    }

    public static void preOrder(Node root,List<Integer> ds){
//// Recursive approach
        //base case
        if(root==null) return;

        System.out.print(root.data+" ");//root
        preOrder(root.left,ds);///left
        preOrder(root.right,ds);///right

    }

    ///we can use stack as dataStructure

}
