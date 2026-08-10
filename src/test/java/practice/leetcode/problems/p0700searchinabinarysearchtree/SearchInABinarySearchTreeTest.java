package practice.leetcode.problems.p0700searchinabinarysearchtree;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;
import static practice.leetcode.common.TreeNodeUtils.buildTree;
import static practice.leetcode.common.TreeNodeUtils.treeEquals;

public class SearchInABinarySearchTreeTest {
    private SearchInABinarySearchTree solution = new SearchInABinarySearchTree();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{4,2,7,1,3});
        TreeNode expected = buildTree(new Integer[]{2,1,3}); // или просто узел со значением 2
        TreeNode result = solution.searchBST(root, 2);
        // Сравниваем деревья, например, через обход в уровень
        assertTrue(treeEquals(expected, result));
    }

    @Test
    void example2() {
        assertNull(solution.searchBST(buildTree(new Integer[]{4,2,7,1,3}), 5));
    }
}
