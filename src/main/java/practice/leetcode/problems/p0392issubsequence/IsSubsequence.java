package practice.leetcode.problems.p0392issubsequence;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int left = 0;
        for (int right = 0; right < t.length() && left < s.length(); right++) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                if (left == s.length()) return true;
            }
        }
        return false;
    }
}
