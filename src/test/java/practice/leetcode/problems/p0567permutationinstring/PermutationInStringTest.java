package practice.leetcode.problems.p0567permutationinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationInStringTest {
    private PermutationInString solution = new PermutationInString();

    @Test
    void example1() {
        assertTrue(solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void example2() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }
}
