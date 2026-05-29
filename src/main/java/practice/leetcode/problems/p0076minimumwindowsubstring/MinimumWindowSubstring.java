package practice.leetcode.problems.p0076minimumwindowsubstring;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        int[] required = new int[128];
        int[] found = new int[128];
        for (char c : t.toCharArray()) {
            required[c]++;
        }
        int requiredCount = 0;
        for (int count : required) {
            if (count > 0) requiredCount++;
        }
        int left = 0, formed = 0, minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            found[currentChar]++;
            if (found[currentChar] == required[currentChar]) {
                formed++;
            }

            while (formed == requiredCount) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                found[leftChar]--;
                if (found[leftChar] < required[leftChar]) formed--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
