package practice.leetcode.problems.p0236lowestcommonancestorofabinarytree;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.TreeNodeUtils.buildTree;
import static practice.leetcode.common.TreeNodeUtils.findNode;

public class LowestCommonAncestorOfABinaryTreeTest {
    private LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = findNode(root, 5);
        TreeNode q = findNode(root, 1);
        assertEquals(3, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void example2() {
        TreeNode root = buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = findNode(root, 5);
        TreeNode q = findNode(root, 4);
        assertEquals(5, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode p = root;          // теперь p ссылается на корень
        TreeNode q = root.left;     // q ссылается на левого ребенка
        assertEquals(1, solution.lowestCommonAncestor(root, p, q).val);
    }
}
