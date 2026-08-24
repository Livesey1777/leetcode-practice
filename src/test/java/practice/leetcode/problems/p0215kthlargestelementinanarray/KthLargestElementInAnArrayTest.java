package practice.leetcode.problems.p0215kthlargestelementinanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementInAnArrayTest {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    @Test
    void example1() {
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void example2() {
        assertEquals(4, solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
