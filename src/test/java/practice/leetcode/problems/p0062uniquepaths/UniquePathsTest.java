package practice.leetcode.problems.p0062uniquepaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {
    private UniquePaths solution = new UniquePaths();

    @Test
    void example1() {
        assertEquals(28, solution.uniquePaths(3, 7));
    }

    @Test
    void example2() {
        assertEquals(3, solution.uniquePaths(3, 2));
    }
}