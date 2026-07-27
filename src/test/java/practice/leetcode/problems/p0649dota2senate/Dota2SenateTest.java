package practice.leetcode.problems.p0649dota2senate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dota2SenateTest {
    private Dota2Senate solution = new Dota2Senate();

    @Test
    void example1() {
        assertEquals("Radiant", solution.predictPartyVictory("RD"));
    }

    @Test
    void example2() {
        assertEquals("Dire", solution.predictPartyVictory("RDD"));
    }
}
