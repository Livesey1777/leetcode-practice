package practice.leetcode.problems.p1768mergestringsalternately;

public class MergeStringsAlternately {
    public String mergeAlternately1(String word1, String word2) {
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

    public String mergeAlternately2(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;

        while (i < len1 || j < len2) {
            if (i < len1) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < len2) {
                result.append(word2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}
