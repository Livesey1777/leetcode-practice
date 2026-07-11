package practice.leetcode.problems.p0011containerwithmostwater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int length = height.length;
        int left = 0, right = length - 1, max = 0;
        while (left < right) {
            int currentLeft = height[left];
            int currentRight =height[right];
            int currentArea = (right - left) * Math.min(currentLeft, currentRight);
            max =  Math.max(max, currentArea);
            if (currentLeft < currentRight) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
