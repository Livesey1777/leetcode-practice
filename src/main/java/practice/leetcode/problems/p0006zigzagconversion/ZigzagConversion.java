package practice.leetcode.problems.p0006zigzagconversion;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int row = 0;
        int direction = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb[row].append(c);
            if (row == 0) {
                direction = 1;
            } else if (row == numRows - 1) {
                direction = -1;
            }
            row += direction;
        }
        for (int i = 1; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}
