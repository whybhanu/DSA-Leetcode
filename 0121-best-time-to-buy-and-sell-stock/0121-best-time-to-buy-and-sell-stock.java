class Solution {
    public static int maxProfit(int[] prices) {
        int first = 0;
        int second = 1;
        int profit = 0;
        int maxProfit = 0;

        while(second < prices.length){
            if(prices[first] < prices[second]){
                profit = prices[second] - prices[first];
                maxProfit = Math.max(maxProfit, profit);
            } else{
                first = second;
            }
            second++;
        }
        return maxProfit;
    }
}   