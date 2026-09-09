package practice.leetcode.problems.p0714besttimetobuyandsellstockwithtransactionfee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {
    private BestTimeToBuyAndSellStockWithTransactionFee solution = new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void example1() {
        assertEquals(8, solution.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }

    @Test
    void example2() {
        assertEquals(6, solution.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }
}