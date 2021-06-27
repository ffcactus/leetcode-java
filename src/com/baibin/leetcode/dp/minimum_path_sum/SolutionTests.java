package com.baibin.leetcode.dp.minimum_path_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int actual = s.minPathSum(grid);
        Assertions.assertEquals(7, actual);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        int[][] grid = new int[][]{{1,2,3},{4,5,6}};
        int actual = s.minPathSum(grid);
        Assertions.assertEquals(12, actual);
    }
}
