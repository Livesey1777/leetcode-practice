package practice.leetcode.problems.p0104maximumdepthofbinarytree;

import practice.leetcode.common.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
