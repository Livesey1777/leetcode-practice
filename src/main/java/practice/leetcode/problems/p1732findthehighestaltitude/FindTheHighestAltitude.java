package practice.leetcode.problems.p1732findthehighestaltitude;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for (int j : gain) {
            currentAltitude += j;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }
}
