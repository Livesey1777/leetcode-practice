package practice.leetcode.problems.p1456maximumnumberofvowelsinasubstringofgivenlength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {
    private MaximumNumberOfVowelsInASubstringOfGivenLength solution = new MaximumNumberOfVowelsInASubstringOfGivenLength();

    @Test
    void example1() {
        assertEquals(3, solution.maxVowels("abciiidef", 3));
    }

    @Test
    void example2() {
        assertEquals(2, solution.maxVowels("aeiou", 2));
    }

    @Test
    void example3() {
        assertEquals(2, solution.maxVowels("leetcode", 3));
    }
}
