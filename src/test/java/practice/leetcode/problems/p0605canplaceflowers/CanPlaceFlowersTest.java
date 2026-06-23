package practice.leetcode.problems.p0605canplaceflowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersTest {
    private CanPlaceFlowers solution = new CanPlaceFlowers();

    @Test
    void example1() {
        assertTrue(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }

    @Test
    void example2() {
        assertFalse(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
}
