package practice.leetcode.problems.p0739dailytemperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {
    private DailyTemperatures solution = new DailyTemperatures();

    @Test
    void example1() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[]{1, 1, 1, 0}, solution.dailyTemperatures(new int[]{30, 40, 50, 60}));
    }

    @Test
    void example3() {
        assertArrayEquals(new int[]{1, 1, 0}, solution.dailyTemperatures(new int[]{30, 60, 90}));
    }
}