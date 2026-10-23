package practice.leetcode.problems.p0015treesum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeSumTest {
    TreeSum solution = new TreeSum();

    private List<List<Integer>> normalize(List<List<Integer>> input) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> triplet : input) {
            List<Integer> sorted = new ArrayList<>(triplet);
            sorted.sort(Integer::compareTo);
            result.add(sorted);
        }
        result.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        return result;
    }

    private void assertTripletsEqual(List<List<Integer>> expected,
                                     List<List<Integer>> actual) {
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void example1() {
        assertTripletsEqual(
                List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)),
                solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4})
        );
    }

    @Test
    void example2() {
        assertTripletsEqual(
                List.of(),
                solution.threeSum(new int[]{0, 1, 1})
        );
    }

    @Test
    void example3() {
        assertTripletsEqual(
                List.of(List.of(0, 0, 0)),
                solution.threeSum(new int[]{0, 0, 0})
        );
    }

    @Test
    void emptyArray() {
        assertTripletsEqual(List.of(), solution.threeSum(new int[]{}));
    }

    @Test
    void lessThanThreeElements() {
        assertTripletsEqual(List.of(), solution.threeSum(new int[]{1}));
        assertTripletsEqual(List.of(), solution.threeSum(new int[]{1, -1}));
    }

    @Test
    void allZeros() {
        assertTripletsEqual(
                List.of(List.of(0, 0, 0)),
                solution.threeSum(new int[]{0, 0, 0, 0, 0})
        );
    }

    @Test
    void noTripletsOnlyPositive() {
        assertTripletsEqual(
                List.of(),
                solution.threeSum(new int[]{1, 2, 3, 4, 5})
        );
    }

    @Test
    void noTripletsOnlyNegative() {
        assertTripletsEqual(
                List.of(),
                solution.threeSum(new int[]{-1, -2, -3, -4})
        );
    }

    @Test
    void multipleTripletsWithDuplicates() {
        assertTripletsEqual(
                List.of(
                        List.of(-2, 0, 2),
                        List.of(-2, 1, 1),
                        List.of(-1, -1, 2),
                        List.of(-1, 0, 1)
                ),
                solution.threeSum(new int[]{-2, 0, 1, 1, 2, -1, -1, 2})
        );
    }

    @Test
    void largeValues() {
        assertTripletsEqual(
                List.of(List.of(-100000, 50000, 50000)),
                solution.threeSum(new int[]{-100000, 50000, 50000})
        );
    }
}