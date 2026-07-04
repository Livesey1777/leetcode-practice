package practice.leetcode.problems.p0151reversewordsinastring;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] array = s.trim().split("\\s+");
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", array);
    }
}
