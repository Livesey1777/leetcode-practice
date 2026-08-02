package practice.leetcode.problems.p0872leafsimilartrees;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;
import static practice.leetcode.common.TreeNodeUtils.buildTree;

public class LeafSimilarTreesTest {
    private LeafSimilarTrees solution = new LeafSimilarTrees();

    @Test
    void example1() {
        TreeNode root1 = buildTree(new Integer[]{3,5,1,6,2,9,8,null,null,7,4});
        TreeNode root2 = buildTree(new Integer[]{3,5,1,6,7,4,2,null,null,null,null,null,null,9,8});
        assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void example2() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);

        assertFalse(solution.leafSimilar(root1, root2));
    }
}
