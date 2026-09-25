package practice.leetcode.problems.p0080removeduplicatesfromsortedarrayii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {
    RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
    @Test
    void example1() {
        int[] nums = {1,1,1,2,2,3};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{1,1,2,2,3}, Arrays.copyOf(nums, k));
    }

    @Test
    void example2() {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int k = solution.removeDuplicates(nums);
        assertEquals(7, k);
        assertArrayEquals(new int[]{0,0,1,1,2,3,3}, Arrays.copyOf(nums, k));
    }
}