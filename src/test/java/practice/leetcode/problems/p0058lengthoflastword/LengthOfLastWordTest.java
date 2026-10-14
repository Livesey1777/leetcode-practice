package practice.leetcode.problems.p0058lengthoflastword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    void example1() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void example2() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void example3() {
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}