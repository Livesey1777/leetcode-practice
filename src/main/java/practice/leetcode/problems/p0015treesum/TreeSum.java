package practice.leetcode.problems.p0015treesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] > 0) break;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] > -nums[i]) right--;
                else if (nums[left] + nums[right] < -nums[i]) left++;
                else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return res;
    }
}
