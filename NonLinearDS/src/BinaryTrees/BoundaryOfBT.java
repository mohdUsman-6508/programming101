package BinaryTrees;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Stack;

public class BoundaryOfBT {
    public static class TreeNode{
      int data;
      TreeNode left,right;
       public TreeNode(int data){
           this.data=data;
           left=right=null;
       }
    }

    static Boolean isLeaf(TreeNode root){
        return (root.left==null) && (root.right==null);
    }

    static void addLB(TreeNode root, ArrayList<Integer> res){
        TreeNode cur=root.left;
        while(cur!=null){
            if(isLeaf(cur)==false) res.add(cur.data);
            if(cur.left!=null) cur=cur.left;
            else cur=cur.right;
        }

    }

    static void addRB(TreeNode root,ArrayList<Integer> res){
        ArrayList<Integer> tempRes=new ArrayList<>();
        TreeNode cur=root.right;
        while (cur!=null){
            if(isLeaf(cur)==false) tempRes.add(cur.data);

            if(cur.right!=null) cur=cur.right;
            else cur=cur.left;
        }

        for (int i=tempRes.size()-1;i>=0;i--){
            res.add(tempRes.get(i));
        }
    }

    static void addLeaves(TreeNode root,ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null) addLeaves(root.left,res);
        if(root.right!=null) addLeaves(root.right,res);
    }
    static ArrayList<Integer> printBoundary(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(isLeaf(root)==false) ans.add(root.data);
        addLB(root,ans);
        addLeaves(root,ans);
        addRB(root,ans);

        return ans;
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(5);

        ArrayList<Integer> bT;
        bT=printBoundary(root);
        System.out.println("The boundary traversal is:");
        for (int val:bT){
            System.out.print(val+" ");
        }



    }
}
