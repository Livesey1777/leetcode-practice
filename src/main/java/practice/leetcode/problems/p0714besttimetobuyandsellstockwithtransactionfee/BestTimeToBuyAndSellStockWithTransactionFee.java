package practice.leetcode.problems.p0714besttimetobuyandsellstockwithtransactionfee;

public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            int oldCash = cash;
            int oldHold = hold;
            hold = Math.max(oldHold, oldCash - price);
            cash = Math.max(oldCash, oldHold + price - fee);
        }
        return cash;
    }
}
