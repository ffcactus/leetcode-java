package com.baibin.leetcode.array.combinationSum2;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(target, 0, candidates, results, path);
        return results;
    }

    private void dfs(int target, int begin, int[] candidates, List<List<Integer>> results, Deque<Integer> path) {
        if (target == 0) {
            results.add((new ArrayList<>(path)));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            // System.out.printf("Target = %d, Start = %d, Path: %s, Select = %d\n", target, start, path, candidates[i]);
            if (target - candidates[i] < 0) {
                break;
            }
            if (i > begin && candidates[i] == candidates[i-1]) {
                continue;
            }

            path.push(candidates[i]);
            dfs(target - candidates[i], i + 1, candidates, results, path);
            path.pop();
        }
    }
}
