package practice.leetcode.problems.p0274hindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    private HIndex solution = new HIndex();

    @Test
    void example1() {
        assertEquals(3, solution.hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    void example2() {
        assertEquals(1, solution.hIndex(new int[]{1, 3, 1}));
    }
}