package practice.leetcode.problems.p0992subarrayswithkdifferentintegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraysWithKDifferentIntegersTest {
    private SubarraysWithKDifferentIntegers solution = new SubarraysWithKDifferentIntegers();

    @Test
    void example1() {
        assertEquals(7, solution.subarraysWithKDistinct(new int[]{1, 2, 1, 2, 3}, 2));
    }

    @Test
    void example2() {
        assertEquals(3, solution.subarraysWithKDistinct(new int[]{1, 2, 1, 3, 4}, 3));
    }
}
