package practice.leetcode.problems.p0713subarrayproductlessthank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarrayProductLessThanKTest {
    private SubarrayProductLessThanK solution = new SubarrayProductLessThanK();

    @Test
    void example1() {
        assertEquals(8, solution.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    @Test
    void example2() {
        assertEquals(0, solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0));
    }

    @Test
    void example3() {
        assertEquals(6, solution.numSubarrayProductLessThanK(new int[]{1, 1, 1}, 2));
    }
}
