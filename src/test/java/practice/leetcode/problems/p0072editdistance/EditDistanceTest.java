package practice.leetcode.problems.p0072editdistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {
    private EditDistance solution = new EditDistance();

    @Test
    void example1() {
        assertEquals(3, solution.minDistance("horse", "ros"));
    }

    @Test
    void example2() {
        assertEquals(5, solution.minDistance("intention", "execution"));
    }

    @Test
    void example3() {
        assertEquals(1, solution.minDistance("a", "ab"));
    }
}