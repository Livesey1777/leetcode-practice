package practice.leetcode.problems.p0724findpivotindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPivotIndexTest {
    private FindPivotIndex solution = new FindPivotIndex();

    @Test
    void example1() {
        assertEquals(3, solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    void example2() {
        assertEquals(-1, solution.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    void example3() {
        assertEquals(0, solution.pivotIndex(new int[]{2, 1, -1}));
    }
}
