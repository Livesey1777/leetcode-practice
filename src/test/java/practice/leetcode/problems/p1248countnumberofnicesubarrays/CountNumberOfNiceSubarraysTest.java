package practice.leetcode.problems.p1248countnumberofnicesubarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumberOfNiceSubarraysTest {
    private CountNumberOfNiceSubarrays solution = new CountNumberOfNiceSubarrays();

    @Test
    void example1() {
        assertEquals(2, solution.numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
    }

    @Test
    void example2() {
        assertEquals(0, solution.numberOfSubarrays(new int[]{2, 4, 6}, 1));
    }

    @Test
    void example3() {
        assertEquals(16, solution.numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
    }
}
