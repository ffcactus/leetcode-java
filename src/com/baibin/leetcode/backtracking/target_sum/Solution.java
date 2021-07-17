package com.baibin.leetcode.backtracking.target_sum;

class Solution {
//    private final Deque<Character> signals = new ArrayDeque<>();
    private int sum;
    private int[] nums;
    private int target;
    private int aws;

    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        this.aws = 0;
        bfs(0);
        return aws;
    }

    private void bfs(int i) {
        if (sum == target && i == nums.length) {
//            System.out.println(signals);
            aws++;
            return;
        }
        if (i >= nums.length) {
            return;
        }
//        signals.addLast('+');
        sum = sum + nums[i];
        bfs(i + 1);
        sum = sum - nums[i];
//        signals.removeLast();

//        signals.addLast('-');
        sum = sum - nums[i];
        bfs(i + 1);
        sum = sum + nums[i];
//        signals.removeLast();
    }
}