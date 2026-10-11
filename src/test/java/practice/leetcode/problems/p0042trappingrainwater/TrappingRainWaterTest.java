package practice.leetcode.problems.p0042trappingrainwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    TrappingRainWater solution = new TrappingRainWater();

    @Test
    void example1() {
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void example2() {
        assertEquals(9, solution.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}