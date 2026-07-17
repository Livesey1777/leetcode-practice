package practice.leetcode.problems.p2215findthedifferenceoftwoarrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindTheDifferenceOfTwoArraysTest {
    private FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();

    private void sortLists(List<List<Integer>> lists) {
        for (List<Integer> list : lists) {
            Collections.sort(list);
        }
    }

    @Test
    void example1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(4, 6));

        List<List<Integer>> actual = solution.findDifference(nums1, nums2);

        sortLists(expected);
        sortLists(actual);
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(new ArrayList<>()); // пустой список

        List<List<Integer>> actual = solution.findDifference(nums1, nums2);

        sortLists(expected);
        sortLists(actual);
        assertEquals(expected, actual);
    }

    @Test
    void emptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());
        expected.add(new ArrayList<>());

        List<List<Integer>> actual = solution.findDifference(nums1, nums2);

        assertEquals(expected, actual);
    }

    @Test
    void noCommonElements() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(3, 4));

        List<List<Integer>> actual = solution.findDifference(nums1, nums2);

        sortLists(expected);
        sortLists(actual);
        assertEquals(expected, actual);
    }
}
