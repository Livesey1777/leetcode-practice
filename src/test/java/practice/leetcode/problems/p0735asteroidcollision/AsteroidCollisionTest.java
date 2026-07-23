package practice.leetcode.problems.p0735asteroidcollision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AsteroidCollisionTest {
    private AsteroidCollision solution = new AsteroidCollision();

    @Test
    void example1() {
        assertArrayEquals(new int[]{5, 10}, solution.asteroidCollision(new int[]{5, 10, -5}));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[]{}, solution.asteroidCollision(new int[]{8, -8}));
    }

    @Test
    void example3() {
        assertArrayEquals(new int[]{10}, solution.asteroidCollision(new int[]{10, 2, -5}));
    }

    @Test
    void example4() {
        assertArrayEquals(new int[]{-6, 2, 4}, solution.asteroidCollision(new int[]{3, 5, -6, 2, -1, 4}));
    }
}
