package practice.leetcode.problems.p0437pathsumiii;

import practice.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1);
        return goodSum(root, 0L, targetSum, prefixCount);
    }

    private int goodSum(TreeNode root, long currentSum, int targetSum, Map<Long, Integer> prefixCount) {
        if (root == null) return 0;
        currentSum += root.val;
        int count = prefixCount.getOrDefault(currentSum - targetSum, 0);
        prefixCount.put(currentSum, prefixCount.getOrDefault(currentSum, 0) + 1);

        count += goodSum(root.left, currentSum, targetSum, prefixCount);
        count += goodSum(root.right, currentSum, targetSum, prefixCount);

        prefixCount.put(currentSum, prefixCount.get(currentSum) - 1);
        return count;
    }
}
