package practice.leetcode.problems.p0162findpeakelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
    private FindPeakElement solution = new FindPeakElement();

    @Test
    void example1() {
        assertEquals(2, solution.findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    void example2() {
        assertEquals(5, solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}
