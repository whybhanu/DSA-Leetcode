class Solution {
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        int maxProfit = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                profit = prices[right] - prices[left];
            }
            if(prices[left] > prices[right]) left = right;
            right++;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}   