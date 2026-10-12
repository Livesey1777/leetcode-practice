package practice.leetcode.problems.p0013romantointeger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    RomanToInteger solution = new RomanToInteger();

    @Test
    void example1() {
        assertEquals(3, solution.romanToInt("III") );
    }

    @Test
    void example2() {
        assertEquals(58, solution.romanToInt("LVIII") );
    }

    @Test
    void example3() {
        assertEquals(1994, solution.romanToInt("MCMXCIV") );
    }
}