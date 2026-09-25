package practice.leetcode.problems.p0169majorityelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    MajorityElement solution = new MajorityElement();

    @Test
    void example1() {
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    void example2() {
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}