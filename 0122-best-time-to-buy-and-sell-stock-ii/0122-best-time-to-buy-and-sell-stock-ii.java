class Solution {
    public int maxProfit(int[] prices) {
        
        // You can hold at most one stock at a time.
        // But you can sell and buy on any given day.
        
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1])
                profit += (prices[i] - prices[i-1]);
        }
        
        return profit;
    }
}