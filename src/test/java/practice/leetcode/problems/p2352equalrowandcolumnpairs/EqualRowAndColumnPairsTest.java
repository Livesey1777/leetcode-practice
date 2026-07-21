package practice.leetcode.problems.p2352equalrowandcolumnpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualRowAndColumnPairsTest {
    private EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();

    @Test
    void example1() {
        assertEquals(1, solution.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
    }

    @Test
    void example2() {
        assertEquals(3, solution.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
    }
}
