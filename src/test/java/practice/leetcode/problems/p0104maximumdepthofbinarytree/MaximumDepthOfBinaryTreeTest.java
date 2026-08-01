package practice.leetcode.problems.p0104maximumdepthofbinarytree;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.TreeNodeUtils.buildTree;

public class MaximumDepthOfBinaryTreeTest {
    private MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertEquals(2, solution.maxDepth(root));
    }
}
