package practice.leetcode.problems.p2390removingstarsfromastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovingStarsFromAStringTest {
    private RemovingStarsFromAString solution = new RemovingStarsFromAString();

    @Test
    void example1() {
        assertEquals("lecoe", solution.removeStars("leet**cod*e"));
    }

    @Test
    void example2() {
        assertEquals("", solution.removeStars("erase*****"));
    }
}
