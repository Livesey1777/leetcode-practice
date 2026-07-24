package practice.leetcode.problems.p0394decodestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeStringTest {
    private DecodeString solution = new DecodeString();

    @Test
    void example1() {
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    void example2() {
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    void example3() {
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }
}
