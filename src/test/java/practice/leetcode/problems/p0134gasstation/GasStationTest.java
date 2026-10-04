package practice.leetcode.problems.p0134gasstation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
    private GasStation solution = new GasStation();

    @Test
    void example1() {
        assertEquals(3, solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void example2() {
        assertEquals(-1, solution.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}