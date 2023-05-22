class Solution {
    public int maxProfit(int[] prices) {
        
        int firstBuy = Integer.MIN_VALUE, secondBuy = Integer.MIN_VALUE, firstSell = 0, secondSell = 0;
        
        for (int i = 0; i < prices.length; i++) {
            
            // If we make the first buy it is going to set us back prices[i] bucks
            firstBuy = Math.max(firstBuy, -prices[i]);
            
            // If we sell the stock we are going to gain prices[i] bucks. And we already have firstBuy bucks left
            firstSell = Math.max(firstSell, firstBuy + prices[i]);
            
            // If we buy second time it is going to set us back prices[i] bucks. And we already have first sell
            secondBuy = Math.max(secondBuy, firstSell - prices[i]);
            
            // If we sell the stock for second time we gain prices[i] bucks. And we already have second buy
            secondSell = Math.max(secondSell, secondBuy + prices[i]);
        }
        
        return secondSell;
    }
}