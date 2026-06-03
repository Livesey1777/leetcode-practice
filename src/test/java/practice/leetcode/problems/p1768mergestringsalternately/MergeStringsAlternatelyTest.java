package practice.leetcode.problems.p1768mergestringsalternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {
    private MergeStringsAlternately solution = new MergeStringsAlternately();

    @Test
    void example1() {
        assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
    }

    @Test
    void example2() {
        assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
    }

    @Test
    void example3() {
        assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }
}
