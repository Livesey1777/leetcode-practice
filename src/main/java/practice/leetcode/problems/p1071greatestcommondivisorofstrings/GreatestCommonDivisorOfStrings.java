package practice.leetcode.problems.p1071greatestcommondivisorofstrings;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings1(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int g = gcd(str1.length(), str2.length());
            return str1.substring(0, g);
        }
        return "";
    }

    public String gcdOfStrings2(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int g = gcd(str1.length(), str2.length());

        for (int d = g; d >= 1; d--) {
            if (len1 % d == 0 && len2 % d == 0) {
                String prefix = str1.substring(0, d);
                if (isRepeated(str1, prefix) && isRepeated(str2, prefix)) {
                    return prefix;
                }
            }
        }

        return "";
    }

    private boolean isRepeated(String s, String prefix) {
        int len = s.length();
        int pLen = prefix.length();

        if (len % pLen != 0) {
            return false;
        }

        for (int i = 0; i < len; i += pLen) {
            if (!s.startsWith(prefix, i)) {
                return false;
            }
        }
        return true;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
