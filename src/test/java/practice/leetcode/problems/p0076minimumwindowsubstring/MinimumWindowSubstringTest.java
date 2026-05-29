package practice.leetcode.problems.p0076minimumwindowsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumWindowSubstringTest {

    private MinimumWindowSubstring solution = new MinimumWindowSubstring();

    @Test
    void example1() {
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void example2() {
        assertEquals("a", solution.minWindow("a", "a"));
    }

    @Test
    void example3() {
        assertEquals("", solution.minWindow("a", "aa"));
    }

    @Test
    void example4() {
        assertEquals("aa", solution.minWindow("aa", "aa"));
    }

    @Test
    void example5() {
        assertEquals("baa", solution.minWindow("bbaa", "aba"));
    }

}
