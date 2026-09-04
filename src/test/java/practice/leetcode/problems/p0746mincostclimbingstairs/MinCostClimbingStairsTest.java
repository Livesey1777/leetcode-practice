package practice.leetcode.problems.p0746mincostclimbingstairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {
    private MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    void example1() {
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    void example2() {
        assertEquals(6, solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}