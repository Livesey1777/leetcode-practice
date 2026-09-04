package practice.leetcode.problems.p0746mincostclimbingstairs;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int a = cost[0];
        int b = cost[1];

        for (int i = 2; i < n; i++) {
            int c = Math.min(a, b) + cost[i];
            a = b;
            b = c;
        }
        return Math.min(a, b);
    }
}
