package practice.leetcode.problems.p0713subarrayproductlessthank;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int result = 0, left = 0;
        int product = 1;
        for (int right = 0; right < nums.length; right++) {
            int currentNumber = nums[right];
            product *= currentNumber;
            while (product >= k) {
                int leftNumber = nums[left];
                product /= leftNumber;
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }
}
