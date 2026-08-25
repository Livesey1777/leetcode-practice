package practice.leetcode.problems.p2336smallestnumberininfiniteset;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallestInfiniteSet {
    private int current;
    private PriorityQueue<Integer> priorityQueue;
    private Set<Integer> set;

    public SmallestInfiniteSet() {
        current = 1;
        priorityQueue = new PriorityQueue<>();
        set = new HashSet<>();
    }

    public int popSmallest() {
        if (!priorityQueue.isEmpty()) {
            int num = priorityQueue.poll();
            set.remove(num);
            return num;
        } else {
            return current++;
        }
    }

    public void addBack(int num) {
        if (num < current && !set.contains(num)) {
            set.add(num);
            priorityQueue.add(num);
        }
    }
}
