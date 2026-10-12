package practice.leetcode.problems.p0013romantointeger;

import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }
}
