package practice.leetcode.problems.p1161maximumlevelsumofabinarytree;

import practice.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        int maxSumLevel = 0;
        int currentLevel = 1;
        int maxSum = Integer.MIN_VALUE;
        if (root == null) return maxSumLevel;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int currentSum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                currentSum += node.val;
            }
            if (currentSum > maxSum) {
                maxSumLevel = currentLevel;
            }
            currentLevel++;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSumLevel;
    }
}
