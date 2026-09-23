package practice.leetcode.problems.p0026removeduplicatesfromsortedarray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    @Test
    void example1() {
        int[] nums = {1,1,2};
        int k = solution.removeDuplicates(nums);
        assertEquals(2, k);
        assertArrayEquals(new int[]{1,2}, Arrays.copyOf(nums, k));
    }

    @Test
    void example2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{0,1,2,3,4}, Arrays.copyOf(nums, k));
    }
}