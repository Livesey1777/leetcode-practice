package practice.leetcode.problems.p0452minimumnumberofarrowstoburstballoons;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;
        int m = points.length;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrow = 1;
        int lastArrow = points[0][1];

        for (int i = 1; i < m; i++) {
            if (points[i][0] > lastArrow) {
                arrow++;
                lastArrow = points[i][1];
            }
        }

        return arrow;
    }
}
