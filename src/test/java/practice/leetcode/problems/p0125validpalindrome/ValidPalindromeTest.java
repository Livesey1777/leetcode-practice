package practice.leetcode.problems.p0125validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    ValidPalindrome solution = new ValidPalindrome();

    @Test
    void example1() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void example2() {
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void example3() {
        assertTrue(solution.isPalindrome(" "));
    }
}