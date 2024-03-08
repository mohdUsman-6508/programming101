public class bst {

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

    public int height(Node node) {
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

        return node;
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
