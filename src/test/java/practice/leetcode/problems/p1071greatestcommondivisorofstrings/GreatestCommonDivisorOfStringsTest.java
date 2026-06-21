package practice.leetcode.problems.p1071greatestcommondivisorofstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfStringsTest {
    private GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();

    @Test
    void example1() {
        assertEquals("ABC", solution.gcdOfStrings1("ABCABC", "ABC"));
        assertEquals("ABC", solution.gcdOfStrings2("ABCABC", "ABC"));
    }

    @Test
    void example2() {
        assertEquals("AB", solution.gcdOfStrings1("ABABAB", "ABAB"));
        assertEquals("AB", solution.gcdOfStrings2("ABABAB", "ABAB"));
    }

    @Test
    void example3() {
        assertEquals("", solution.gcdOfStrings1("LEET", "CODE"));
        assertEquals("", solution.gcdOfStrings2("LEET", "CODE"));
    }

    @Test
    void example4() {
        assertEquals("", solution.gcdOfStrings1("AAAAAB", "AAA"));
        assertEquals("", solution.gcdOfStrings2("AAAAAB", "AAA"));
    }
}
