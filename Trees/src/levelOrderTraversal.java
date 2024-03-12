import java.util.*;

public class levelOrderTraversal {

    public static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);

    }


    public List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return result;
        q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int levelSize = q.size();

            // running for each level
            for (int i = 0; i < levelSize; i++) {
                TreeNode p = q.peek();
                if (p.left != null) q.offer(p.left);
                if (p.right != null) q.offer(p.right);

                list.add(p.val);
                q.poll();

            }
            result.add(list);
        }

        return result;
    }


    /// level order successor
    private static int los(TreeNode root, int s) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
                TreeNode peek = q.poll();
                if (peek.left != null) q.offer(peek.left);
                if (peek.right != null) q.offer(peek.right);
                if (s == peek.val) {
                    break;
                }
        }
        return q.poll().val;
    }
}

