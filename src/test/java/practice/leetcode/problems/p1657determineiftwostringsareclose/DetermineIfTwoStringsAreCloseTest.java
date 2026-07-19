package practice.leetcode.problems.p1657determineiftwostringsareclose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetermineIfTwoStringsAreCloseTest {
    private DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();

    @Test
    void example1() {
        assertTrue(solution.closeStrings("abc", "bca"));
    }

    @Test
    void example2() {
        assertFalse(solution.closeStrings("a", "aa"));
    }

    @Test
    void example3() {
        assertTrue(solution.closeStrings("cabbba", "abbccc"));
    }
}
