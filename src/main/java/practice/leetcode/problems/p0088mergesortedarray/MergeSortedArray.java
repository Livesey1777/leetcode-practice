package practice.leetcode.problems.p0088mergesortedarray;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int rightNums1 = m - 1;
        int rightNums2 = n - 1;
        int right = m + n - 1;

        while (rightNums2 >= 0) {
            if (rightNums1 < 0) {
                nums1[right] = nums2[rightNums2];
                rightNums2--;
            } else if (nums1[rightNums1] < nums2[rightNums2]) {
                nums1[right] = nums2[rightNums2];
                rightNums2--;
            } else {
                nums1[right] = nums1[rightNums1];
                rightNums1--;
            }
            right--;
        }
    }
}
