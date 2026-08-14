package practice.leetcode.problems.p1161maximumlevelsumofabinarytree;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.TreeNodeUtils.buildTree;

public class MaximumLevelSumOfABinaryTreeTest {
    private MaximumLevelSumOfABinaryTree solution = new MaximumLevelSumOfABinaryTree();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{1, 7, 0, 7, -8, null, null});
        assertEquals(2, solution.maxLevelSum(root));
    }

    @Test
    void example2() {
        TreeNode root = buildTree(new Integer[]{989, null, 10250, 98693, -89388, null, null, null, -32127});
        assertEquals(2, solution.maxLevelSum(root));
    }
}
