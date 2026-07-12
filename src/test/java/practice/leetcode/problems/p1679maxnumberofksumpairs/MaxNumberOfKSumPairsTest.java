package practice.leetcode.problems.p1679maxnumberofksumpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairsTest {
    private MaxNumberOfKSumPairs solution = new MaxNumberOfKSumPairs();

    @Test
    void example1() {
        assertEquals(2, solution.maxOperations(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    void example2() {
        assertEquals(1, solution.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
    }
}
