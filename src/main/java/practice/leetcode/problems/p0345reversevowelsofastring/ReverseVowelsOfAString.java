package practice.leetcode.problems.p0345reversevowelsofastring;

import java.util.Set;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] result = s.toCharArray();
        int length = s.length();
        int left = 0, right = length - 1;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        while (right > left) {
            char leftChar = result[left];
            char rightChar = result[right];
            if (vowels.contains(leftChar) && vowels.contains(rightChar)) {
                result[left] = rightChar;
                result[right] = leftChar;
                right--;
                left++;
            } else if (!vowels.contains(leftChar)) {
                left++;
            } else {
                right--;
            }
        }
        return new String(result);
    }
}
