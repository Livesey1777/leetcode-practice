package practice.leetcode.problems.p0841keysandrooms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Deque<Integer> stack = new ArrayDeque<>();
        int visitedCount = 0;
        visited[0] = true;
        stack.push(0);
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            visitedCount++;
            for (int key : rooms.get(curr)) {
                if (!visited[key]) {
                    visited[key] = true;
                    stack.push(key);
                }
            }
        }
        return visitedCount == rooms.size();
    }
}
