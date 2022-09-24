package com.baibin.leetcode.backtracking.combination_sum;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
         Solution s = new Solution();
         var actual = s.combinationSum(new int[]{2, 3, 6, 7}, 7);
         System.out.println(actual);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var actual = s.combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(actual);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var actual = s.combinationSum(new int[]{2}, 1);
        System.out.println(actual);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        var actual = s.combinationSum(new int[]{1}, 2);
        System.out.println(actual);
    }
}
