package practice.leetcode.problems.p0017lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    private static final Map<Character, String> PHONE_MAP = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backtrack(new StringBuilder(), 0, digits);
        return result;
    }

    private void backtrack(StringBuilder current, int index, String digits) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = PHONE_MAP.get(digits.charAt(index));

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(current, index + 1, digits);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
