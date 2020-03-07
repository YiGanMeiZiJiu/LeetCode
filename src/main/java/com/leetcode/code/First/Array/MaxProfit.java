package com.leetcode.code.First.Array;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class MaxProfit {

    /**
     i代表当前处于第i天。k表示当前股票还可交易次数。0代表当前不持有股票。1代表当前持有股票
     dp[i][k][0] = max( dp[i-1][k][0], dp[i-1][k][1]+price[i] )    昨天不持有股票：昨天就不持有 or 昨天持有，今天卖掉了
     dp[i][k][1] = max( dp[i-1][k][1], dp[i-1][k-1][0]-price[i] )    昨天就持有股票：昨天就持有   or 昨天不持有，今天买入了
     当k不限制次数时，可以不管k的存在
     dp[i][0] = max( dp[i-1][0], dp[i-1][1]+price[i] )
     dp[i][1] = max( dp[i-1][1], dp[i-1][0]-price[i] )
     */
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        // 第0天不持有股票情况下的收益
        int dp_i_0 = 0;
        // 第0天持有股票情况下的收益
        int dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, temp - prices[i]);
        }
        return dp_i_0;
    }

//    public static void main(String[] args) {
//        int[] prices = new int[] {7,1,5,3,6,4};
//        System.out.println(maxProfit(prices));
//    }

}
