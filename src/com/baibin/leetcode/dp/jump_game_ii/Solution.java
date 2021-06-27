package com.baibin.leetcode.dp.jump_game_ii;

class Solution {
    // Suppose we reach i with the minimum jumps, then we may know the minimum steps to those steps can be reached from this step.
    public int jump(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return 0;
        }
        int[] memo = new int[l];
        for (int i = 0; i < l; i++) {
            memo[i] = Integer.MAX_VALUE;
        }
        memo[0] = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= i + nums[i] && j < l; j++) {
                memo[j] = Math.min(memo[j], memo[i] + 1);
            }
        }
        return memo[l - 1];
    }
}