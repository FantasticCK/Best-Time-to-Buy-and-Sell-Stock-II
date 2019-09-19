package com.CK;

public class Main {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        new Solution().maxProfit(prices);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;
        int slow = 0, fast = 1, res = 0;
        for (fast = 1; fast < prices.length; fast++) {
            if (prices[fast] >= prices[slow]) {
                res += (prices[fast] - prices[slow]);
                slow++;
                continue;
            }
            slow = fast;
        }
        return res;
    }
}