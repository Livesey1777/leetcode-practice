package practice.leetcode.problems.p0058lengthoflastword;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        return trimmed.substring(trimmed.lastIndexOf(" ") + 1).length();
    }
}
