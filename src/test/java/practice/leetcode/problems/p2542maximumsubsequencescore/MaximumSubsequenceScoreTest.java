package practice.leetcode.problems.p2542maximumsubsequencescore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubsequenceScoreTest {
    MaximumSubsequenceScore solution = new MaximumSubsequenceScore();

    @Test
    void example1() {
        assertEquals(12, solution.maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3));
    }

    @Test
    void example2() {
        assertEquals(30, solution.maxScore(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1));
    }

    @Test
    void example3() {
        assertEquals(168, solution.maxScore(new int[]{2,1,14,12}, new int[]{11,7,13,6}, 3));
    }
}
