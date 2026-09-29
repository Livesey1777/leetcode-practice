package practice.leetcode.problems.p0055jumpgame;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, nums[i] + i);
        }
        return farthest >= nums.length - 1;
    }
}
