package practice.leetcode.problems.p0901onlinestockspan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockSpannerTest {

    @Test
    void example1() {
        StockSpanner spanner = new StockSpanner();

        assertEquals(1, spanner.next(100));
        assertEquals(1, spanner.next(80));
        assertEquals(1, spanner.next(60));
        assertEquals(2, spanner.next(70));
        assertEquals(1, spanner.next(60));
        assertEquals(4, spanner.next(75));
        assertEquals(6, spanner.next(85));
    }

    @Test
    void singleDay() {
        StockSpanner spanner = new StockSpanner();
        assertEquals(1, spanner.next(5));
    }

    @Test
    void monotonicallyIncreasing() {

        StockSpanner spanner = new StockSpanner();
        assertEquals(1, spanner.next(10));
        assertEquals(2, spanner.next(20));
        assertEquals(3, spanner.next(30));
        assertEquals(4, spanner.next(40));
        assertEquals(5, spanner.next(50));
    }

    @Test
    void monotonicallyDecreasing() {

        StockSpanner spanner = new StockSpanner();
        assertEquals(1, spanner.next(50));
        assertEquals(1, spanner.next(40));
        assertEquals(1, spanner.next(30));
        assertEquals(1, spanner.next(20));
        assertEquals(1, spanner.next(10));
    }

    @Test
    void equalPrices() {

        StockSpanner spanner = new StockSpanner();
        assertEquals(1, spanner.next(10));
        assertEquals(2, spanner.next(10));
        assertEquals(3, spanner.next(10));
        assertEquals(4, spanner.next(10));
    }

    @Test
    void mixedCase() {
        StockSpanner spanner = new StockSpanner();
        assertEquals(1, spanner.next(31));
        assertEquals(2, spanner.next(41));
        assertEquals(3, spanner.next(48));
        assertEquals(4, spanner.next(59));
        assertEquals(5, spanner.next(79));
    }

    @Test
    void dropAndRecover() {
        StockSpanner spanner = new StockSpanner();
        assertEquals(1, spanner.next(28));  // [28]
        assertEquals(1, spanner.next(14));  // 14 <= 28? нет, потому span=1
        assertEquals(3, spanner.next(28));  // 28, 14, 28
        assertEquals(4, spanner.next(35));  // 35,28,14,28
        assertEquals(5, spanner.next(46));  // 46,35,28,14,28
    }

    @Test
    void independentInstances() {
        // Проверка, что разные объекты не делят состояние
        StockSpanner a = new StockSpanner();
        StockSpanner b = new StockSpanner();

        assertEquals(1, a.next(100));
        assertEquals(1, b.next(50));
        assertEquals(2, a.next(100));
        assertEquals(2, b.next(50));
    }
}