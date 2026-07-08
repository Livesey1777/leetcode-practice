package practice.leetcode.problems.p0443stringcompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {
    private StringCompression solution = new StringCompression();

    @Test
    void example1() {
        assertEquals(6, solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    void example2() {
        assertEquals(1, solution.compress(new char[]{'a'}));
    }

    @Test
    void example3() {
        assertEquals(4, solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}
