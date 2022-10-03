package com.baibin.leetcode.array.combinationSum3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        Deque<Integer> path = new ArrayDeque<>();
        List<List<Integer>> results = new ArrayList<>();
        dfs(n, 1, k, path, results);
        return results;
    }

    private void dfs(int target, int start, int remains, Deque<Integer> path, List<List<Integer>> results) {
        System.out.printf("Target %d, start = %d, remains = %d, path = %s\n", target, start, remains, path);
        if (target == 0 && remains == 0) {
            results.add(new ArrayList<>(path));
            return;
        }
        if (remains == 0) {
            return;
        }
        for (int i = start; i < 10; i++) {
            if (target - i < 0) {
                continue;
            }
            path.push(i);
            dfs(target - i, i + 1, remains - 1, path, results);
            path.pop();
        }
    }
}
