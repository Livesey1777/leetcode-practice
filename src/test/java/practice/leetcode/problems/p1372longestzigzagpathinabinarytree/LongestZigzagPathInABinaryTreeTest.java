package practice.leetcode.problems.p1372longestzigzagpathinabinarytree;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.TreeNodeUtils.buildTree;

public class LongestZigzagPathInABinaryTreeTest {
    private LongestZigzagPathInABinaryTree solution = new LongestZigzagPathInABinaryTree();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1});
        assertEquals(3, solution.longestZigZag(root));
    }

    @Test
    void example2() {
        TreeNode root = buildTree(new Integer[]{1, 1, 1, null, 1, null, null, 1, 1, null, 1});
        assertEquals(4, solution.longestZigZag(root));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1);
        assertEquals(0, solution.longestZigZag(root));
    }
}
