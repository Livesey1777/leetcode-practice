package practice.leetcode.problems.p2390removingstarsfromastring;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemovingStarsFromAString {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
