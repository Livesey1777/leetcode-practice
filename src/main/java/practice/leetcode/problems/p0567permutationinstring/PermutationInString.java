package practice.leetcode.problems.p0567permutationinstring;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int wordLen = s1.length();
        Map<Character, Integer> required = new HashMap<>();
        for (int i = 0; i < wordLen; i++) {
            required.put(s1.charAt(i), required.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int left = 0, seen = 0;
        Map<Character, Integer> found = new HashMap<>();
        for (int right = 0; right < s2.length(); right++) {
            Character currentChar = s2.charAt(right);
            if (!required.containsKey(currentChar)) {
                found.clear();
                seen = 0;
                left = right + 1;
                continue;
            }
            int count = found.getOrDefault(currentChar, 0) + 1;
            found.put(currentChar, count);

            if (count == required.get(currentChar)) {
                seen++;
            }

            while (found.get(currentChar) > required.get(currentChar)) {
                char leftChar = s2.charAt(left);

                int leftCount = found.get(leftChar);
                if (leftCount == required.get(leftChar)) seen--;
                found.put(leftChar, leftCount - 1);
                left++;
            }

            if (seen == required.size()) {
                return true;
            }
        }
        return false;
    }
}
