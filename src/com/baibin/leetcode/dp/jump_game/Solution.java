package com.baibin.leetcode.dp.jump_game;

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean[] reachable = new boolean[nums.length];
        for (int i = 0; i <= nums[0] && i < nums.length; i++) {

            reachable[i] = true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (reachable[nums.length - 1]) {
                return true;
            }
            if (!reachable[i]) {
                break;
            }
            for (int j = 0; j <= nums[i]; j++) {
                if (i + j == nums.length) {
                    break;
                }
                reachable[i + j] = true;
            }
        }
        return reachable[nums.length - 1];
    }
}