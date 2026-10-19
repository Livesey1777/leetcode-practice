package practice.leetcode.problems.p0068textjustification;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {
    TextJustification solution = new TextJustification();

    @Test
    void  example1() {
        assertEquals(List.of("This    is    an",
                "example  of text",
                "justification.  "), solution.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }

    @Test
    void  example2() {
        assertEquals(List.of("What   must   be",
                "acknowledgment  ",
                "shall be        "), solution.fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16));
    }

    @Test
    void  example3() {
        assertEquals(List.of("Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "), solution.fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20));
    }
}