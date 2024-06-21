public class questions {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);


        dfs(root);
        System.out.println(max);

    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            System.out.println(max);
            return 0;
        }
        System.out.println(root.val);
        int leftSum = dfs(root.left);

        int rightSum = dfs(root.right);
        System.out.println(rightSum);

        leftSum = Math.max(0, leftSum);
        rightSum = Math.max(0, rightSum);
        System.out.println(leftSum);
        System.out.println(rightSum);

        int pathSum = leftSum + rightSum + root.val;
        System.out.println(pathSum);
        max = Math.max(max, pathSum);
        System.out.println(max);

        return Math.max(leftSum, rightSum) + root.val;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

