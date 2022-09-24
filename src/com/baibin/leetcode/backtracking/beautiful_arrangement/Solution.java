package com.baibin.leetcode.backtracking.beautiful_arrangement;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    private boolean[] used;
    private int n;
    private Deque<Integer> solution = new ArrayDeque();
    private int count;

    public int countArrangement(int n) {
        this.n = n;
        this.used = new boolean[n];
        dfs(1);
        return count;
    }

    private void dfs(int start) {
        if (start > n) {
            count++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (used[i - 1]) {
                continue;
            }
            if (start % i == 0 || i % start == 0) {
                used[i - 1] = true;
                solution.add(i);
                dfs(start + 1);
                solution.removeLast();
                used[i - 1] = false;
            }
        }
    }
}
