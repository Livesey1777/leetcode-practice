package practice.leetcode.problems.p1143longestcommonsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {
    private LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    void example1() {
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void example2() {
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void example3() {
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }
}