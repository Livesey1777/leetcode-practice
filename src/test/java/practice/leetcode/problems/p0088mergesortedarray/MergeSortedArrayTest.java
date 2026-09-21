package practice.leetcode.problems.p0088mergesortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    private MergeSortedArray solution = new MergeSortedArray();

    @Test
    void example1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    void example2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        solution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void example3() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }

}