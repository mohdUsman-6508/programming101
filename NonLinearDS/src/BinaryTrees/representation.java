package BinaryTrees;

public class representation {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }


    }

    public static void main(String[] args) {
        Node bt = new Node(7);
        bt.left=new Node(8);
        bt.right=new Node(6);
        bt.left.left=new Node(1);
        bt.left.right=new Node(2);

    }
}
