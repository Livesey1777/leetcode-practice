package practice.leetcode.problems.p0438findallanagramsinastring;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindAllAnagramsInAStringTest {
    private FindAllAnagramsInAString solution = new FindAllAnagramsInAString();

    @Test
    void example1() {
        List<Integer> actual = solution.findAnagrams("cbaebabacd", "abc");
        assertEquals(2, actual.size());
        assertTrue(actual.containsAll(List.of(0, 6)));
    }

    @Test
    void example2() {
        List<Integer> actual = solution.findAnagrams("abab", "ab");
        assertEquals(3, actual.size());
        assertTrue(actual.containsAll(List.of(0, 1, 2)));
    }
}
