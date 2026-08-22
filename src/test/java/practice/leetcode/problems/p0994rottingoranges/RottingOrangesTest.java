package practice.leetcode.problems.p0994rottingoranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOrangesTest {
    private RottingOranges solution = new RottingOranges();

    @Test
    void example1() {
        assertEquals(4, solution.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }

    @Test
    void example2() {
        assertEquals(-1, solution.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
    }

    @Test
    void example3() {
        assertEquals(0, solution.orangesRotting(new int[][]{{0, 2}}));
    }
}
