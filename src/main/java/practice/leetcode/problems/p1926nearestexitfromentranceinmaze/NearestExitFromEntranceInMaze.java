package practice.leetcode.problems.p1926nearestexitfromentranceinmaze;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    static class Point {
        int row, col, dist;
        Point(int r, int c, int d) { row = r; col = c; dist = d; }
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;

        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        int startRow = entrance[0], startCol = entrance[1];
        queue.offer(new Point(startRow, startCol, 0));
        visited[startRow][startCol] = true;

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if ((p.row == 0 || p.row == rows - 1 || p.col == 0 || p.col == cols - 1) && p.dist > 0) {
                return p.dist;
            }

            for (int i = 0; i < 4; i++) {
                int nextRow = p.row + dRow[i];
                int nextCol = p.col + dCol[i];
                if (nextRow >= 0 &&
                        nextRow < rows &&
                        nextCol >= 0 && nextCol < cols &&
                        maze[nextRow][nextCol] == '.' &&
                        !visited[nextRow][nextCol]) {
                    visited[nextRow][nextCol] = true;
                    queue.offer(new Point(nextRow, nextCol, p.dist + 1));
                }
            }
        }
        return -1;
    }
}
