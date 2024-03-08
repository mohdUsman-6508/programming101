public class bstmain {
    public static void main(String[] args) {
        bst bt = new bst();
        int[] nums = {10, 8, 12};
        bt.populate(nums);
        bt.display();
        bt.preorder();
        bt.inorder();
        bt.postorder();
    }
}
