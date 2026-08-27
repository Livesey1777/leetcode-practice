package practice.leetcode.problems.p2462totalcosttohirekworkers;

import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        long totalCost = 0;
        PriorityQueue<int[]> leftHeap = new PriorityQueue<>((a, b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        PriorityQueue<int[]> rightHeap = new PriorityQueue<>((a, b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int left = 0;
        int right = costs.length - 1;

        while (left < candidates && left <= right) {
            leftHeap.add(new int[]{costs[left], left});
            left++;
        }

        while (right >= costs.length - candidates && left <= right) {
            rightHeap.add(new int[]{costs[right], right});
            right--;
        }

        for (int i = 0; i < k; i++) {
            int[] fromLeft = leftHeap.peek();
            int[] fromRight = rightHeap.peek();

            if (fromRight == null || (fromLeft != null && fromLeft[0] <= fromRight[0])) {
                totalCost += fromLeft[0];
                leftHeap.poll();
                if (left <= right) {
                    leftHeap.add(new int[]{costs[left], left});
                    left++;
                }
            } else {
                totalCost += fromRight[0];
                rightHeap.poll();
                if (left <= right) {
                    rightHeap.add(new int[]{costs[right], right});
                    right--;
                }
            }
        }

        return totalCost;
    }
}
