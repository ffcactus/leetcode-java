package com.baibin.leetcode.array.findDiagonalOrder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTests {
    @Test
    public void testCase1() {
        var s = new Solution();
        var result = s.findDiagonalOrder(new int[][]{{1,2,3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testCase2() {
        var s = new Solution();
        var result = s.findDiagonalOrder(new int[][]{{2,3}});
        System.out.println(Arrays.toString(result));
    }
}
