package practice.leetcode.problems.p0080removeduplicatesfromsortedarrayii;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int slow = 2, fast = slow;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
