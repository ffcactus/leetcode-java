package com.baibin.leetcode.array.combinationSum3;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        var result = s.combinationSum3(3, 7);
        System.out.println(result);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var result = s.combinationSum3(3, 9);
        System.out.println(result);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var result = s.combinationSum3(4, 1);
        System.out.println(result);
    }
}
