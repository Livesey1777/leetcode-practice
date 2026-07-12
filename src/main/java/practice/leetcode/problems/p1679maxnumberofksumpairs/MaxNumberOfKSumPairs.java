package practice.leetcode.problems.p1679maxnumberofksumpairs;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, operations = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                left++;
                right--;
                operations++;
            } else if (sum < k){
                left++;
            } else {
                right--;
            }
        }
        return operations;
    }
}
