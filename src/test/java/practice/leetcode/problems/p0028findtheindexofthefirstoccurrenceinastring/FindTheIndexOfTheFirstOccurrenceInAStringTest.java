package practice.leetcode.problems.p0028findtheindexofthefirstoccurrenceinastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    void example1() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    void example2() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
}