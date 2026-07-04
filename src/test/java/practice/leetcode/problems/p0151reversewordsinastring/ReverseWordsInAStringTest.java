package practice.leetcode.problems.p0151reversewordsinastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringTest {
    ReverseWordsInAString solution = new ReverseWordsInAString();

    @Test
    void example1() {
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    }

    @Test
    void example2() {
        assertEquals("world hello", solution.reverseWords("  hello world  "));
    }

    @Test
    void example3() {
        assertEquals("example good a", solution.reverseWords("a good   example"));
    }
}
