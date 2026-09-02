package practice.leetcode.problems.p0216combinationsumiii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIiiTest {
    private CombinationSumIii solution = new CombinationSumIii();

    @Test
    void example1() {
        assertEquals(List.of(List.of(1,2,4)), solution.combinationSum3(3, 7));
    }

    @Test
    void example2() {
        assertEquals(List.of(
                List.of(1,2,6),
                List.of(1,3,5),
                List.of(2,3,4)), solution.combinationSum3(3, 9));
    }

}