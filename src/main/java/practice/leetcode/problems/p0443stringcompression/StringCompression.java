package practice.leetcode.problems.p0443stringcompression;

public class StringCompression {
    public int compress(char[] chars) {
        int left = 0, write = 0;
        for (int right = 1; right < chars.length; right++) {
            if (chars[left] != chars[right]) {
                int len = right - left;
                chars[write++] = chars[left];
                if (len > 1) {
                    int div  = 1;
                    while (len / div >= 10) {
                        div *= 10;
                    }

                    while (div != 0) {
                        int digit = len / div;
                        chars[write++] = (char) (digit + '0');
                        len %= div;
                        div /= 10;
                    }
                }
                left = right;
            }
        }
        int len = chars.length - left;
        chars[write++] = chars[left];
        if (len > 1) {
            int div  = 1;
            while (len / div >= 10) {
                div *= 10;
            }

            while (div != 0) {
                int digit = len / div;
                chars[write++] = (char) (digit + '0');
                len %= div;
                div /= 10;
            }
        }
        return write;
    }
}