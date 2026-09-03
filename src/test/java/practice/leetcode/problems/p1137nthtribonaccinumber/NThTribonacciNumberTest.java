package practice.leetcode.problems.p1137nthtribonaccinumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NThTribonacciNumberTest {
    private NThTribonacciNumber solution = new NThTribonacciNumber();

    @Test
    void example1() {
        assertEquals(4, solution.tribonacci(4));
    }

    @Test
    void example2() {
        assertEquals(1389537, solution.tribonacci(25));
    }
}
