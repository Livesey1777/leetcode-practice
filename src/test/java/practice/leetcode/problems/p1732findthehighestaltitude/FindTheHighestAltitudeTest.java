package practice.leetcode.problems.p1732findthehighestaltitude;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheHighestAltitudeTest {
    private FindTheHighestAltitude solution = new FindTheHighestAltitude();

    @Test
    void example1() {
        assertEquals(1, solution.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    @Test
    void example2() {
        assertEquals(0, solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}
