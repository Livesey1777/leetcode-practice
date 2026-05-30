package practice.leetcode.problems.p1248countnumberofnicesubarrays;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int result = 0, left = 0, oddCount = 0;

        for (int right = 0; right < nums.length; right++) {
            int currentNumber = nums[right];
            if (currentNumber % 2 == 1) oddCount++;

            while (oddCount > k) {
                int leftNumber = nums[left];
                if (leftNumber % 2 == 1) oddCount--;
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }
}
