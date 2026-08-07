package practice.leetcode.problems.p1372longestzigzagpathinabinarytree;

import practice.leetcode.common.TreeNode;

public class LongestZigzagPathInABinaryTree {
    private int maxLen = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return maxLen;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) return new int[]{0, 0};

        int[] leftRes = (node.left != null) ? dfs(node.left) : new int[]{0,0};
        int[] rightRes = (node.right != null) ? dfs(node.right) : new int[]{0,0};

        int left = (node.left != null) ? leftRes[1] + 1 : 0;
        int right = (node.right != null) ? rightRes[0] + 1 : 0;

        int curMax = Math.max(left, right);
        maxLen = Math.max(maxLen, curMax);

        return new int[]{left, right};
    }
}
