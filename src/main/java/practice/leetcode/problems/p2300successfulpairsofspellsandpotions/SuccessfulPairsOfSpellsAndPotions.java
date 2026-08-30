package practice.leetcode.problems.p2300successfulpairsofspellsandpotions;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            long threshold = (success + spell - 1) / spell;
            int low = 0;
            int high = potions.length;
            while (low < high) {
                int mid = low + (high - low)/ 2;
                if (potions[mid] >= threshold) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            result[i] = potions.length - low;
        }
        return result;
    }
}
