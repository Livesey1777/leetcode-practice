package practice.leetcode.problems.p0199binarytreerightsideview;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.TreeNodeUtils.buildTree;

public class BinaryTreeRightSideViewTest {
    private BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, solution.rightSideView(root));
    }

    @Test
    void example2() {
        TreeNode root = buildTree(new Integer[]{1, 2, 3, 4, null, null, null, 5});
        List<Integer> expected = Arrays.asList(1, 3, 4, 5);
        assertEquals(expected, solution.rightSideView(root));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        List<Integer> expected = Arrays.asList(1, 3);
        assertEquals(expected, solution.rightSideView(root));
    }

    @Test
    void example4() {
        TreeNode root = null;
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.rightSideView(root));
    }
}
