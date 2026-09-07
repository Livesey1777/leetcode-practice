package practice.leetcode.problems.p0790dominoandtrominotiling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominoAndTrominoTilingTest {
    private DominoAndTrominoTiling solution = new DominoAndTrominoTiling();

    @Test
    void example1() {
        assertEquals(5, solution.numTilings(3));
    }

    @Test
    void example2() {
        assertEquals(1, solution.numTilings(1));
    }

    @Test
    void example3() {
        assertEquals(312342182, solution.numTilings(30));
    }
}