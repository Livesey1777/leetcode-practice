package practice.leetcode.problems.p1431kidswiththegreatestnumberofcandies;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithTheGreatestNumberOfCandiesTest {
    private KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();

    @Test
    void example1() {
        assertEquals(Arrays.asList(true, true, true, false, true),
                solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    @Test
    void example2() {
        assertEquals(Arrays.asList(true, false, false, false, false),
                solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }

    @Test
    void example3() {
        assertEquals(Arrays.asList(true, false, true),
                solution.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}
