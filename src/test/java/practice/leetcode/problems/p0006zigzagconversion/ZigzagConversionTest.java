package practice.leetcode.problems.p0006zigzagconversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {
    ZigzagConversion solution = new ZigzagConversion();

    @Test
    void example1() {
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }

    @Test
    void example2() {
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }

    @Test
    void example3() {
        assertEquals("A", solution.convert("A", 1));
    }
}