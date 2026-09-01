package practice.leetcode.problems.p0017lettercombinationsofaphonenumber;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {
    private LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();

    @Test
    void example1() {
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), solution.letterCombinations("23"));
    }

    @Test
    void example2() {
        assertEquals(List.of("a", "b", "c"), solution.letterCombinations("2"));
    }
}
