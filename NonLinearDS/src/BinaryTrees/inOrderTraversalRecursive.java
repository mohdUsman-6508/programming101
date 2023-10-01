package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class inOrderTraversalRecursive {
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

        root.right=new Node(3);
        root.right.right=new Node(5);
        root.right.left=new Node(6);


        List<Integer> ds=new ArrayList<>();
        inOrder(root,ds);
        System.out.println();

        for(int val:ds){
            System.out.print(val+" ");
        }

    }


    //// recursive solution

    private static void inOrder(Node root,List<Integer> ds){

        //base case
        if(root==null) return;

        inOrder(root.left,ds);
        System.out.print(root.data+" ");
        ds.add(root.data);
        inOrder(root.right,ds);

    }
}
