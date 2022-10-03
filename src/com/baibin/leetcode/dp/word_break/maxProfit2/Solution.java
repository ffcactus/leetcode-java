package com.baibin.leetcode.dp.word_break.maxProfit2;

public class Solution {
    private int result = 0;
    private enum Status {
        HasStock,
        NoStock,
    }

    public int maxProfit(int[] prices) {
        dfs(prices, prices.length, 0, Status.NoStock, 0);
        return result;
    }

    /**
     * Use DFS algorithm the find out the profile on each path. Depends on the current status (Have stock or not).
     * We can sell and buy or do nothing, this will impact our current profile, the operation will set the status of
     * the next day.
     * @param prices The historical prices.
     * @param dayCount How many days in historical prices.
     * @param day The current day.
     * @param status The current status.
     * @param profile The current profile.
     */
    private void dfs(int[] prices, int dayCount, int day, Status status, int profile) {
        if (day == dayCount) {
            result = Math.max(profile, result);
            return;
        }
        // no operation, no profile change.
        dfs(prices, dayCount, day + 1, status, profile);

        // If we have stock, we can sell it today, our profile will increase today, but we won't have stock tomorrow.
        if (status == Status.HasStock) {
            dfs(prices, dayCount, day + 1, Status.NoStock, profile + prices[day]);
        }
        // If we don't have stock, we can buy it today, our profile will decrease today, but we will have stock tomorrow.
        if (status == Status.NoStock){
            dfs(prices, dayCount, day + 1, Status.HasStock, profile - prices[day]);
        }
    }
}
