package practice.leetcode.problems.p0450deletenodeinabst;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.TreeNode;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static practice.leetcode.common.TreeNodeUtils.*;

public class DeleteNodeInABstTest {
    private DeleteNodeInABst solution = new DeleteNodeInABst();

    @Test
    void example1() {
        TreeNode root = buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        TreeNode result = solution.deleteNode(root, 3);

        assertTrue(isValidBST(result));

        List<Integer> expectedValues = collectValues(root);
        expectedValues.remove(Integer.valueOf(3)); // удаляем 3
        Collections.sort(expectedValues);

        List<Integer> actualValues = collectValues(result);
        Collections.sort(actualValues);

        assertEquals(expectedValues, actualValues, "Набор значений не совпадает с ожидаемым");
    }

    @Test
    void example2() {
        TreeNode root = buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        TreeNode expected = buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        TreeNode result = solution.deleteNode(root, 0);

        assertTrue(treeEquals(expected, result));
    }

    @Test
    void example3() {
        assertNull(solution.deleteNode(buildTree(new Integer[]{}), 0));
    }
}
