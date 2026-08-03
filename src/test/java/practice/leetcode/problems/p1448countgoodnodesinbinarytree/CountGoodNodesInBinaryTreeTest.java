package practice.leetcode.problems.p1448countgoodnodesinbinarytree;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.TreeNodeUtils.buildTree;

public class CountGoodNodesInBinaryTreeTest {
    CountGoodNodesInBinaryTree solution = new CountGoodNodesInBinaryTree();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{3, 1, 4, 3, null, 1, 5});
        assertEquals(4, solution.goodNodes(root));
    }

    @Test
    void example2() {
        TreeNode root = buildTree(new Integer[]{3, 3, null, 4, 2});
        assertEquals(3, solution.goodNodes(root));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, solution.goodNodes(root));
    }
}
