package com.baibin.leetcode.dp.minimum_path_sum;

class Solution {
    private int[][] memo;
    private int[][] grid;

    public int minPathSum(int[][] grid) {
        this.grid = grid;
        int rows = grid.length;
        int columns = grid[0].length;
        // The first row and first column can be seem as init state.
        memo = new int[rows][columns];
        memo[0][0] = grid[0][0];
        for (int column = 1; column < columns; column++) {
            memo[0][column] = memo[0][column - 1] + this.grid[0][column];
        }
        for (int row = 1; row < rows; row++) {
            memo[row][0] = memo[row - 1][0] + this.grid[row][0];
        }
        return dp(rows -1, columns -1);
    }

    public int dp(int row, int column) {
        if (row == 0 || column == 0) {
            return memo[row][column];
        }
        if (memo[row][column] != 0) {
            return memo[row][column];
        }
        memo[row][column] = grid[row][column] + Math.min(dp(row - 1, column), dp(row, column - 1));
        return memo[row][column];
    }
}