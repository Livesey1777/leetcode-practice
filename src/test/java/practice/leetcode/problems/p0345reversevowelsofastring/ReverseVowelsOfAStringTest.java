package practice.leetcode.problems.p0345reversevowelsofastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfAStringTest {
    private ReverseVowelsOfAString solution = new ReverseVowelsOfAString();

    @Test
    void example1() {
        assertEquals("AceCreIm", solution.reverseVowels("IceCreAm"));
    }

    @Test
    void example2() {
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }
}
