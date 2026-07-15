package practice.leetcode.problems.p1493longestsubarrayof1safterdeletingoneelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayOf1sAfterDeletingOneElementTest {
    private LongestSubarrayOf1sAfterDeletingOneElement solution = new LongestSubarrayOf1sAfterDeletingOneElement();

    @Test
    void example1() {
        assertEquals(3, solution.longestSubarray(new int[]{1, 1, 0, 1}));
    }

    @Test
    void example2() {
        assertEquals(5, solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    }

    @Test
    void example3() {
        assertEquals(2, solution.longestSubarray(new int[]{1, 1, 1}));
    }
}
