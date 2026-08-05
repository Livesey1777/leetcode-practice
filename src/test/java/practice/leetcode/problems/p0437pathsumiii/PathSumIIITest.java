package practice.leetcode.problems.p0437pathsumiii;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.TreeNodeUtils.buildTree;

public class PathSumIIITest {
    private PathSumIII solution = new PathSumIII();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});
        assertEquals(3, solution.pathSum(root, 8));
    }

    @Test
    void example2() {
        TreeNode root = buildTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        assertEquals(3, solution.pathSum(root, 22));
    }
}
