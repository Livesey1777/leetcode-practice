package practice.leetcode.problems.p1207uniquenumberofoccurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueNumberOfOccurrencesTest {
    private final UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();

    @Test
    void example1() {
        assertTrue(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    @Test
    void example2() {
        assertFalse(solution.uniqueOccurrences(new int[]{1, 2}));
    }

    @Test
    void example3() {
        assertTrue(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}
