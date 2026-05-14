package practice.leetcode.problems.p0643maximumaveragesubarrayi;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        for (int right = 0; right < k; right++) {
            windowSum += nums[right];
        }
        double maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right] - nums[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }
}
