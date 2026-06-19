package practice.leetcode.problems.p1768mergestringsalternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {
    private MergeStringsAlternately solution = new MergeStringsAlternately();

    @Test
    void example1() {
        assertEquals("apbqcr", solution.mergeAlternately1("abc", "pqr"));
        assertEquals("apbqcr", solution.mergeAlternately2("abc", "pqr"));
    }

    @Test
    void example2() {
        assertEquals("apbqrs", solution.mergeAlternately1("ab", "pqrs"));
        assertEquals("apbqrs", solution.mergeAlternately2("ab", "pqrs"));
    }

    @Test
    void example3() {
        assertEquals("apbqcd", solution.mergeAlternately1("abcd", "pq"));
        assertEquals("apbqcd", solution.mergeAlternately2("abcd", "pq"));
    }
}
