package practice.leetcode.problems.p0283movezeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {
    private MoveZeroes solution = new MoveZeroes();

    @Test
    void example1() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        solution.moveZeroes(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void example2() {
        int[] input = new int[]{0};
        int[] expected = new int[]{0};
        solution.moveZeroes(input);
        assertArrayEquals(expected, input);
    }
}
