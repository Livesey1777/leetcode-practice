package practice.leetcode.problems.p0994rottingoranges;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    static class Point {
        int row, col;
        Point(int r, int c) { row = r; col = c;}
    }

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int freshOranges = 0;
        int minutes = 0;

        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Point(i, j));
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0) {
            return 0;
        }

        int[] dRow = {-1,1,0,0};
        int[] dCol = {0,0,-1,1};

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                Point point = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int r = point.row + dRow[k];
                    int c = point.col + dCol[k];
                    if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        queue.add(new Point(r, c));
                        freshOranges--;
                        flag = true;
                    }
                }
            }
            if (flag) minutes++;
        }
        return freshOranges > 0 ? -1 : minutes;
    }
}
