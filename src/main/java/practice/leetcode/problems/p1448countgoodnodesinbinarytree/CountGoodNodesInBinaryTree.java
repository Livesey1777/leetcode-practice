package practice.leetcode.problems.p1448countgoodnodesinbinarytree;

import practice.leetcode.common.TreeNode;

public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, root.val);
    }

    private int countGoodNodes(TreeNode node, int maxOnPath) {
        if (node == null) return 0;
        int newMax = Math.max(maxOnPath, node.val);
        return (node.val >= maxOnPath ? 1 : 0)
                + countGoodNodes(node.left, newMax)
                + countGoodNodes(node.right, newMax);
    }
}
