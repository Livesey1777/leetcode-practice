package practice.leetcode.problems.p2462totalcosttohirekworkers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalCostToHireKWorkersTest {
    private TotalCostToHireKWorkers solution = new TotalCostToHireKWorkers();

    @Test
    void example1() {
        assertEquals(11, solution.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4));
    }

    @Test
    void example2() {
        assertEquals(4, solution.totalCost(new int[]{1, 2, 4, 1}, 3, 3));
    }

    @Test
    void example3() {
        assertEquals(423, solution.totalCost(new int[]{31, 25, 72, 79, 74, 65, 84, 91, 18, 59, 27, 9, 81, 33, 17, 58}, 11, 2));
    }
}
