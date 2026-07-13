package practice.leetcode.problems.p1456maximumnumberofvowelsinasubstringofgivenlength;

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int maxWindow = 0;
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                maxWindow++;
            }
        }

        int max = maxWindow;

        for (int i = k; i < s.length(); i++) {
            if (set.contains(s.charAt(i - k))) {
                maxWindow--;
            }
            if (set.contains(s.charAt(i))) {
                maxWindow++;
                max = Math.max(max, maxWindow);
            }
        }
        return max;
    }
}
