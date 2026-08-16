package practice.leetcode.problems.p0547numberofprovinces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfProvincesTest {
    private NumberOfProvinces solution = new NumberOfProvinces();

    @Test
    void example1() {
        assertEquals(2, solution.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }

    @Test
    void example2() {
        assertEquals(3, solution.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }
}
