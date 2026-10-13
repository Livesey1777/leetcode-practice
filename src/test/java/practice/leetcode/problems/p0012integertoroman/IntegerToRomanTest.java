package practice.leetcode.problems.p0012integertoroman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    IntegerToRoman solution = new IntegerToRoman();

    @Test
    void example1() {
        assertEquals("MMMDCCXLIX", solution.intToRoman(3749));
    }

    @Test
    void example2() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void example3() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}