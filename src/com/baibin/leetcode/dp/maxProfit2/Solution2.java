package com.baibin.leetcode.dp.maxProfit2;

public class Solution2 {
    private static final int withoutStock = 0;
    private static final int withStock = 1;

    public int maxProfit(int[] prices) {

        int dayCount = prices.length;
        if (dayCount < 2) {
            return 0;
        }

        /*
         * This value represents profile at as special day under special state.
         * The day is the first dimension and the state is the second dimension.
         * State has 2 possible value, withoutStock and withStock.
         */
        int[][] profileMap = new int[dayCount][2];

        // With the initialized value, we can find the profile day after day.
        profileMap[0][withoutStock] = 0;
        profileMap[0][withStock] = -prices[0];

        for (int day = 1; day < dayCount; day++) {
            // If we don't have stock today, our profile should be the max value between:
            profileMap[day][withoutStock] = Math.max(
                    // 1. We don't have stock yesterday, and we did nothing yesterday.
                    profileMap[day - 1][withoutStock],
                    // 2. We have stock yesterday, and we sell them today.
                    profileMap[day - 1][withStock] + prices[day]
            );
            // If we have stock today, our profile should be the max value between:
            profileMap[day][withStock] = Math.max(
                    // 1. We have stock yesterday, and we did nothing yesterday.
                    profileMap[day - 1][withStock],
                    // 2. We don't have stock yesterday, and we buy stock today.
                    profileMap[day - 1][withoutStock] - prices[day]
            );
        }
        return profileMap[dayCount - 1][withoutStock];
    }
}
