package practice.leetcode.problems.p2215findthedifferenceoftwoarrays;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int j : nums1) set1.add(j);

        Set<Integer> set2 = new HashSet<>();
        for (int j : nums2) set2.add(j);

        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        return Arrays.asList(new ArrayList<>(diff1), new ArrayList<>(diff2));
    }
}
