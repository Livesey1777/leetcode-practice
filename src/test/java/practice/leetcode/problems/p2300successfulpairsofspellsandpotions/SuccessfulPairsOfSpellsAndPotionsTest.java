package practice.leetcode.problems.p2300successfulpairsofspellsandpotions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SuccessfulPairsOfSpellsAndPotionsTest {
    private SuccessfulPairsOfSpellsAndPotions solution = new SuccessfulPairsOfSpellsAndPotions();

    @Test
    void example1() {
        assertArrayEquals(new int[]{4, 0, 3}, solution.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[]{2, 0, 2}, solution.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16));
    }
}
