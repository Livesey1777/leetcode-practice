package practice.leetcode.problems.p1926nearestexitfromentranceinmaze;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearestExitFromEntranceInMazeTest {
    private NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();

    @Test
    void example1() {
        assertEquals(1, solution.nearestExit(
                new char[][]{{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}}, new int[]{1, 2}));
    }

    @Test
    void example2() {
        assertEquals(2, solution.nearestExit(
                new char[][]{{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}}, new int[]{1, 0}));
    }

    @Test
    void example3() {
        assertEquals(-1, solution.nearestExit(
                new char[][]{{'.', '+'}}, new int[]{0, 0}));
    }
}
