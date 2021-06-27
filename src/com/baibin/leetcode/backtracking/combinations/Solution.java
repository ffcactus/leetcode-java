package com.baibin.leetcode.backtracking.combinations;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    private int n;
    private int k;
    private Deque<Integer> solution = new ArrayDeque<>();
    private List<List<Integer>> answers = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k == 0) {
            return answers;
        }
        this.n = n;
        this.k = k;
        dfs(1, k);
        return answers;
    }

    private void dfs(int start, int k) {
        if (solution.size() == k) {
            answers.add(new ArrayList<>(solution));
            return;
        }
        if (start == n + 1) {
            return;
        }
        solution.addLast(start);
        dfs(start+1, k);
        solution.removeLast();
        dfs(start + 1, k);
    }
}