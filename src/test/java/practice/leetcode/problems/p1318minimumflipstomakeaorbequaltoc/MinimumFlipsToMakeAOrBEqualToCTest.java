package practice.leetcode.problems.p1318minimumflipstomakeaorbequaltoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFlipsToMakeAOrBEqualToCTest {
    private MinimumFlipsToMakeAOrBEqualToC solution = new MinimumFlipsToMakeAOrBEqualToC();

    @Test
    void example1() {
        assertEquals(3, solution.minFlips(2, 6, 5));
    }

    @Test
    void example2() {
        assertEquals(1, solution.minFlips(4, 2, 7));
    }

    @Test
    void example3() {
        assertEquals(0, solution.minFlips(1, 2, 3));
    }

}