package practice.leetcode.problems.p0394decodestring;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {
    public String decodeString(String s) {
        Deque<Integer> numbers = new ArrayDeque<>();
        Deque<StringBuilder> strings = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        int currentNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(currentChar);
            } else if (currentChar == '[') {
                numbers.push(currentNumber);
                strings.push(result);
                result = new StringBuilder();
                currentNumber = 0;
            } else if (currentChar == ']') {
                StringBuilder prev = strings.pop();
                int number = numbers.pop();
                prev.append(result.toString().repeat(number));
                result = prev;
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
