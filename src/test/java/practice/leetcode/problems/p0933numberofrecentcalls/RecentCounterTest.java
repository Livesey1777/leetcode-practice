package practice.leetcode.problems.p0933numberofrecentcalls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecentCounterTest {

    @Test
    void testExample1() {
        RecentCounter counter = new RecentCounter();
        assertEquals(1, counter.ping(1));
        assertEquals(2, counter.ping(100));
        assertEquals(3, counter.ping(3001));
        assertEquals(3, counter.ping(3002));
    }

    @Test
    void testExample2() {
        RecentCounter counter = new RecentCounter();
        assertEquals(1, counter.ping(642));
        assertEquals(2, counter.ping(1849));
        assertEquals(1, counter.ping(4921));
        assertEquals(2, counter.ping(5936));
        assertEquals(3, counter.ping(5957));
    }
}
