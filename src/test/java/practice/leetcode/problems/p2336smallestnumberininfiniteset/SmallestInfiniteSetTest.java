package practice.leetcode.problems.p2336smallestnumberininfiniteset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestInfiniteSetTest {

    @Test
    void example1() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        set.addBack(2);
        assertEquals(1, set.popSmallest());
        assertEquals(2, set.popSmallest());
        assertEquals(3, set.popSmallest());
        set.addBack(1);
        assertEquals(1, set.popSmallest());
        assertEquals(4, set.popSmallest());
        assertEquals(5, set.popSmallest());
    }

    @Test
    void testAddBackAlreadyPresent() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        set.popSmallest();
        set.addBack(1);
        set.addBack(1);
        assertEquals(1, set.popSmallest());
        assertEquals(2, set.popSmallest());
    }

    @Test
    void testPopSequence() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        for (int i = 1; i <= 10; i++) {
            assertEquals(i, set.popSmallest());
        }
    }

    @Test
    void testAddBackAfterPop() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        for (int i = 1; i <= 5; i++) {
            set.popSmallest();
        }
        set.addBack(3);
        set.addBack(7);
        assertEquals(3, set.popSmallest());
        assertEquals(6, set.popSmallest());
        assertEquals(7, set.popSmallest());
        assertEquals(8, set.popSmallest());
    }
}
