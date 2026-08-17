package practice.leetcode.problems.p1466reorderroutestomakeallpathsleadtothecityzero;

import java.util.*;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public int minReorder(int n, int[][] connections) {
        int count = 0;
        List<List<int[]>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];

            graph.get(a).add(new int[]{b, 1});

            graph.get(b).add(new int[]{a, 0});
        }

        boolean[] visited = new boolean[n];

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        visited[0] = true;
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            for (int[] city : graph.get(cur)) {
                if (!visited[city[0]]) {
                    visited[city[0]] = true;
                    if (city[1] == 1) {
                        count++;
                    }
                    stack.push(city[0]);
                }
            }
        }
        return count;
    }
}
