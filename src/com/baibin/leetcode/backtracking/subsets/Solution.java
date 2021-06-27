package com.baibin.leetcode.backtracking.subsets;

import java.util.*;

class Solution {
    private List<List<Integer>> answer = new ArrayList<>();
    private Deque<Integer> solution = new ArrayDeque<>();
    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        dfs(0);
        return answer;
    }

    private void dfs(int start) {
        if (start == nums.length) {
            answer.add(new ArrayList<>(solution));
            return;
        }
        Integer n = nums[start];
        solution.addLast(n);
        dfs(start + 1);
        solution.removeLast();
        dfs(start + 1);
    }
}