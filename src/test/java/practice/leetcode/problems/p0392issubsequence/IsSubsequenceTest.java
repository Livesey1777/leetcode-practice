package practice.leetcode.problems.p0392issubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequenceTest {
    private IsSubsequence solution = new IsSubsequence();

    @Test
    void example1() {
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void example2() {
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}
