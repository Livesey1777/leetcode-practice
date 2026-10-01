package practice.leetcode.problems.p0274hindex;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] >= n - i) {
                hIndex = n - i;
            } else {
                break;
            }
        }
        return hIndex;
    }
}
