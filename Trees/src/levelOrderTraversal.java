import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
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


    // zig zak order traversal
    private static List<List<Integer>> zigzak(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);

        boolean reverse = false;
        while (!dq.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = dq.size();
            for (int i = 0; i < size; i++) {
                if (!reverse) {
                    TreeNode node = dq.poll();
                    if (node.left != null) dq.add(node.left);
                    if (node.right != null) dq.add(node.right);
                    l.add(node.val);

                } else {
                    TreeNode node = dq.pollLast();
                    if (node.right != null) dq.addFirst(node.right);
                    if (node.left != null) dq.addFirst(node.left);
                    l.add(node.val);

                }
            }
            reverse = !reverse;
            list.add(l);
        }


        return list;
    }


    private static List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return result;
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
                if (node != null) level.add(node.val);
            }
            result.add(level);
        }
        return result;
    }


}

