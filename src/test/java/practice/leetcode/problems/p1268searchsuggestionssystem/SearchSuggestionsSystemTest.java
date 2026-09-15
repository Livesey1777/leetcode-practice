package practice.leetcode.problems.p1268searchsuggestionssystem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchSuggestionsSystemTest {
    private SearchSuggestionsSystem solution = new SearchSuggestionsSystem();

    @Test
    void example1() {
        List<List<String>> expected = List.of(
                List.of("mobile","moneypot","monitor"),
                List.of("mobile","moneypot","monitor"),
                List.of("mouse","mousepad"),
                List.of("mouse","mousepad"),
                List.of("mouse","mousepad"));
        assertEquals(expected, solution.suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse"));
    }

    @Test
    void example2() {
        List<List<String>> expected = List.of(
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"));
        assertEquals(expected, solution.suggestedProducts(new String[]{"havana"}, "havana"));
    }
}
