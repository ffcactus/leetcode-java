package com.baibin.leetcode.array.set_zeroes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTests {
    @Test
    public void testCase1() {
        var s = new Solution();
        var matrix = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        s.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
