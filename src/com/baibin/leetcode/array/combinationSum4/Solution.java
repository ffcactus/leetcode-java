package com.baibin.leetcode.array.combinationSum4;

import java.util.Arrays;

public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[target];
    }
}
