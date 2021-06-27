package com.baibin.leetcode.backtracking.n_queens;

import java.util.*;

class Solution {
    private int n;
    private List<List<String>> answer;
    private boolean[][] records;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        this.records = new boolean[n][n];
        this.answer = new ArrayList<>();
        dfs(0, new ArrayDeque<>());
        return this.answer;
    }

    private void dfs(int row, Deque<Integer> solution) {
        if (row == n) {
            answer.add(toAnswer(solution));
            return;
        }
        for (int column = 0; column < n; column++) {
            if (canPut(row, column)) {
                solution.addLast(column);
                addRecord(row, column);
                dfs(row + 1, solution);
                removeRecord(row, column);
                solution.removeLast();
            }
        }
    }

    private List<String> toAnswer(Deque<Integer> solution) {
        List<String> board = new ArrayList<>();
        for (Integer num : solution) {
            StringBuilder row = new StringBuilder();
            row.append(".".repeat(Math.max(0, n)));
            row.replace(num, num + 1, "Q");
            board.add(row.toString());
        }
        return board;
    }

    private boolean canPut(int row, int column) {
        for (int x = 0; x < n; x++) {
            if (records[x][column]) {
                return false;
            }
        }
        for (int y = 0; y < n; y++) {
            if (records[row][y]) {
                return false;
            }
        }
        for (int x = row, y = column; x < n && y < n; x++, y++) {
            if (records[x][y]) {
                return false;
            }
        }
        for (int x = row, y = column; x >=0 && y >= 0; x--, y--) {
            if (records[x][y]) {
                return false;
            }
        }
        for (int x = row, y = column; x < n && y >= 0; x++, y--) {
            if (records[x][y]) {
                return false;
            }
        }
        for (int x = row, y = column; x >= 0 && y < n; x--, y++) {
            if (records[x][y]) {
                return false;
            }
        }
        return true;
    }

    private void addRecord(int row, int column) {
        records[row][column] = true;
    }

    private void removeRecord(int row, int column) {
        records[row][column] = false;
    }
}