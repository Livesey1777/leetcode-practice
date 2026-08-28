package practice.leetcode.problems.p0374guessnumberhigherorlower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberHigherOrLowerTest {
    private GuessNumberHigherOrLower solution;

    @BeforeEach
    void setUp() {
        solution = new GuessNumberHigherOrLower();
    }

    @Test
    void example1() {
        solution.setPick(6);
        assertEquals(6, solution.guessNumber(10));
    }

    @Test
    void example2() {
        solution.setPick(1);
        assertEquals(1, solution.guessNumber(1));
    }

    @Test
    void example3() {
        solution.setPick(1);
        assertEquals(1, solution.guessNumber(2));
    }

    // Дополнительные тесты для граничных случаев
    @Test
    void pickAtMax() {
        solution.setPick(10);
        assertEquals(10, solution.guessNumber(10));
    }

    @Test
    void pickAtMin() {
        solution.setPick(1);
        assertEquals(1, solution.guessNumber(100));
    }

    @Test
    void pickInMiddle() {
        solution.setPick(50);
        assertEquals(50, solution.guessNumber(100));
    }

    @Test
    void pickNearLow() {
        solution.setPick(2);
        assertEquals(2, solution.guessNumber(100));
    }

    @Test
    void pickNearHigh() {
        solution.setPick(99);
        assertEquals(99, solution.guessNumber(100));
    }
}
