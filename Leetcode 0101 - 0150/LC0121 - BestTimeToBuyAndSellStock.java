// Problem Link ::: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int N = prices.length;
        if (N == 0 || N == 1) {
            return 0;
        }
        int max = prices[N-1];
        int maximumProfit = 0;
        for (int i = N-2 ; i >= 0 ; i--) {
            if (prices[i] > max) {
                max = prices[i];
            }
            int profit = max - prices[i];
            if (profit > maximumProfit) {
                maximumProfit = profit;
            }
        }
        return maximumProfit;
    }
}