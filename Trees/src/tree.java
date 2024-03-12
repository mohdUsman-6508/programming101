import java.util.*;

public class tree {


    public class Node {
        int val;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

    }

    public Node root;

    public void populate(Scanner scanner) {
        System.out.println("enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
        System.out.println("end:");
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do you want to enter left of " + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value of left of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("do you want to enter value of right of " + node.val);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("enter the value of right of " + node.val);
            int value = scanner.nextInt();
            root.right = new Node(value);
            populate(scanner, root.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) return;
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");


    }
}
