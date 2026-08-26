package practice.leetcode.problems.p2542maximumsubsequencescore;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        long maxScore = 0;
        int[][] pairs = new int[nums1.length][2];

        for (int i = 0; i < nums1.length; i++) {
            pairs[i][0] = nums2[i];
            pairs[i][1] = nums1[i];
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;

        for (int i = 0; i < nums1.length; i++) {
            pq.add(pairs[i][1]);
            sum += pairs[i][1];
            if (pq.size() > k) {
                sum -= pq.poll();
            }
            if (pq.size() == k) {
                maxScore = Math.max(maxScore, sum * pairs[i][0]);
            }
        }
        return maxScore;
    }
}
