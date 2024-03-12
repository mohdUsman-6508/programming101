public class AVL {


    public class Node {
        int val;
        int height;
        Node left;
        Node right;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public int height() {
        int h=height(root);
        return h;
    }

    private int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    private Node insert(int val, Node node) {

        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val < node.val) {
            node.left = insert(val, node.left);
        }

        if (val > node.val) {
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            //right heavy
            if (height(node.right.right) - height(node.right.left) < 0) {
                return leftRotate(node);
            }
            if (height(node.right.right) - height(node.right.left) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height((p.right)) + 1);
        c.height = Math.max(height(c.left), height((c.right)) + 1);
        return p;
    }

    public Node rightRotate(Node node) {
        Node c = node.left;
        Node t = c.right;
        c.right = node;
        node.left = t;
        node.height = Math.max(height(node.left), height((node.right)) + 1);
        c.height = Math.max(height(c.left), height((c.right)) + 1);
        return c;
    }

    public boolean balanced(Node node) {
        if (node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root node:");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    private void display(Node node, String details) {
        if (node == null) return;

        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " :");
        display(node.right, "Right child of " + node.val + " :");
    }

    /// traversals

    //preorder rlr
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    private void postorder(Node node) {
        if (node == null) return;
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.val + " ");
    }

    private void inorder(Node node) {
        if (node == null) return;
        preorder(node.left);
        System.out.print(node.val + " ");
        preorder(node.right);
    }
}


