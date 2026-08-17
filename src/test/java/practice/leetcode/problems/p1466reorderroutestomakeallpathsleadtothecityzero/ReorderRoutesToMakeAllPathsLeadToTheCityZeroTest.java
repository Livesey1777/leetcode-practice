package practice.leetcode.problems.p1466reorderroutestomakeallpathsleadtothecityzero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {
    private ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();

    @Test
    void example1() {
        assertEquals(3, solution.minReorder(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}));
    }

    @Test
    void example2() {
        assertEquals(2, solution.minReorder(5, new int[][]{{1, 0}, {1, 2}, {3, 2}, {3, 4}}));
    }

    @Test
    void example3() {
        assertEquals(0, solution.minReorder(3, new int[][]{{1, 0}, {2, 0}}));
    }
}
