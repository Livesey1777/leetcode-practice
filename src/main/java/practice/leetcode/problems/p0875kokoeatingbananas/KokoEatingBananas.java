package practice.leetcode.problems.p0875kokoeatingbananas;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = max(piles);

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(mid, piles, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int max(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    private boolean canEatAll(int k, int[] piles, int h) {
        int total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += (piles[i] + k - 1) / k;
        }
        return total <= h;
    }
}
