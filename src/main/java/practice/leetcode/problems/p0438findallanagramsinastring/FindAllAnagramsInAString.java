package practice.leetcode.problems.p0438findallanagramsinastring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int wordLen  = p.length();
        Map<Character, Integer> required = new HashMap<>();
        for (int i = 0; i < wordLen; i++) {
            required.put(p.charAt(i), required.getOrDefault(p.charAt(i), 0) + 1);
        }
        int left = 0, seen = 0;
        Map<Character, Integer> found = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            Character currentChar = s.charAt(right);
            if (!required.containsKey(currentChar)) {
                found = new HashMap<>();
                seen = 0;
                left = right + 1;
            } else {
                int count = found.getOrDefault(currentChar, 0) + 1;
                found.put(currentChar, count);

                if (count == required.get(currentChar)) {
                    seen++;
                }

                while (found.get(currentChar) > required.get(currentChar)) {
                    char leftChar = s.charAt(left);

                    int leftCount = found.get(leftChar);
                    if (leftCount == required.get(leftChar)) seen--;
                    found.put(leftChar, leftCount - 1);
                    left++;
                }

                if (seen == required.size()) {
                    result.add(left);
                    char leftChar = s.charAt(left);

                    int leftCount = found.get(leftChar);
                    if (leftCount == required.get(leftChar)) seen--;
                    found.put(leftChar, leftCount - 1);
                    left++;
                }
            }
        }
        return result;
    }
}
