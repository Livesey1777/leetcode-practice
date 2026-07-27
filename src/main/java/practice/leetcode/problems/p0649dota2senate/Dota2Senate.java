package practice.leetcode.problems.p0649dota2senate;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        int length = senate.length();

        for (int i = 0; i < length; i++) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.add(i);
            } else {
                direQueue.add(i);
            }
        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int rIndex = radiantQueue.peek();
            int dIndex = direQueue.peek();
            if (rIndex < dIndex) {
                direQueue.poll();
                radiantQueue.poll();
                radiantQueue.add(rIndex + length);
            } else {
                radiantQueue.poll();
                direQueue.poll();
                direQueue.add(dIndex + length);
            }
        }

        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
