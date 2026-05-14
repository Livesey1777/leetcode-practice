package practice.leetcode.problems.p0643maximumaveragesubarrayi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAverageSubarrayITest {

    private MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();

    @Test
    void example1() {
        assertEquals(12.7500, solution.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }

    @Test
    void example2() {
        assertEquals(5, solution.findMaxAverage(new int[]{5}, 1));
    }
}
