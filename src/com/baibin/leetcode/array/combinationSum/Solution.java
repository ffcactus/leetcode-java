package com.baibin.leetcode.array.combinationSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, target, path, results);
        return results;
    }

    private void dfs(int[] candidates, int start, int target, Deque<Integer> path, List<List<Integer>> results) {
        System.out.printf("Path: %s\n", path);

        for (int i = start; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) {
                break;
            }
            target -= candidates[i];
            path.push(candidates[i]);
            if (target == 0) {
                results.add(new ArrayList<>(path));
                path.pop();
                break;
            }
            if (target < 0) {
                path.pop();
                break;
            }
            dfs(candidates, i, target, path, results);
            target += candidates[i];
            path.pop();
        }
    }
}
