package com.baibin.leetcode.array.rotate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTests {
    @Test
    public void testCase1() {
        var s = new Solution();
        var matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        s.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    @Test
    public void testCase2() {
        var s = new Solution();
        var matrix = new int[][]{{5, 1, 9,11}, {2, 4, 8,10}, {13, 3, 6, 7}, {15,14,12,16}};
        s.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
