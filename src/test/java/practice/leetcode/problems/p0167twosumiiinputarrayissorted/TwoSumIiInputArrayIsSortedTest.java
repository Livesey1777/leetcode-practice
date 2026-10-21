package practice.leetcode.problems.p0167twosumiiinputarrayissorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIiInputArrayIsSortedTest {
    TwoSumIiInputArrayIsSorted solution = new TwoSumIiInputArrayIsSorted();

    @Test
    void example1() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[]{1, 3}, solution.twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    void example3() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{-1, 0}, -1));
    }
}