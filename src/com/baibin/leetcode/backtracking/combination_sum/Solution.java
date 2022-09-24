package com.baibin.leetcode.backtracking.combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private int[] candidates;
    private int target;
    private List<Integer> solution = new ArrayList<>();
    private int sum;
    private List<List<Integer>> solutions = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(this.candidates);
        bfs(0);
        return solutions;
    }

    private void bfs(int start) {
        if (sum == target) {
            solutions.add(new ArrayList<>(solution));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            solution.add(candidates[i]);
            sum += candidates[i];
            bfs(i);
            sum -= candidates[i];
            solution.remove(solution.size() - 1);
        }
    }
}