package practice.leetcode.problems.p0992subarrayswithkdifferentintegers;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int left = 0, result = 0;
        Map<Integer, Integer> window = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int currentNumber = nums[right];
            window.put(currentNumber, window.getOrDefault(currentNumber, 0) + 1);

            while (window.size() > k) {
                int leftNumber = nums[left];
                window.put(leftNumber, window.get(leftNumber) - 1);
                if (window.get(leftNumber) == 0) window.remove(leftNumber);
                left++;
            }

            result += right - left + 1;
        }
        return result;
    }
}
