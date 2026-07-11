package practice.leetcode.problems.p0011containerwithmostwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    private ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    void example1() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void example2() {
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }
}
