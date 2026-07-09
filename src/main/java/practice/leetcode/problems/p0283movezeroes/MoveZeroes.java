package practice.leetcode.problems.p0283movezeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int write = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                int temp = nums[write];
                nums[write] = nums[i];
                nums[i] = temp;
                write++;
            }
        }
    }
}
