package practice.leetcode.problems.p1768mergestringsalternately;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (len1 > len2) {
            result.append(word1.substring(minLen));
        } else {
            result.append(word2.substring(minLen));
        }
        return result.toString();
    }
}
