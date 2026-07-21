package practice.leetcode.problems.p2352equalrowandcolumnpairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Map<List<Integer>, Integer> map = new HashMap<>();
        int pairs = 0;
        for (int[] row : grid) {
            List<Integer> key = new ArrayList<>(row.length);
            for (int col : row) {
                key.add(col);
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int col = 0; col < cols; col++) {
            List<Integer> key = new ArrayList<>(cols);
            for (int row = 0; row < rows; row++) {
                key.add(grid[row][col]);
            }
            pairs += map.getOrDefault(key, 0);
        }

        return pairs;
    }
}
