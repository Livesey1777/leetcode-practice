package practice.leetcode.problems.p0435nonoverlappingintervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {
    private NonOverlappingIntervals solution = new NonOverlappingIntervals();

    @Test
    void example1() {
        assertEquals(1, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
    }

    @Test
    void example2() {
        assertEquals(2, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
    }

    @Test
    void example3() {
        assertEquals(0, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }

}