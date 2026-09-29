package practice.leetcode.problems.p0055jumpgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    JumpGame solution = new JumpGame();

    @Test
    void example1() {
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void example2() {
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
