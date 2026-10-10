package practice.leetcode.problems.p0135candy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {
    Candy solution = new Candy();

    @Test
    void example1() {
        assertEquals(5, solution.candy(new int[]{1, 0, 2}));
    }

    @Test
    void example2() {
        assertEquals(4, solution.candy(new int[]{1, 2, 2}));
    }
}