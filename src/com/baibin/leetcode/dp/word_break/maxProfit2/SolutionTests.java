package com.baibin.leetcode.dp.word_break.maxProfit2;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        var result = s.maxProfit(new int[]{1, 2});
        System.out.println(result);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var result = s.maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(result);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var result = s.maxProfit(new int[]{1,2,3,4,5});
        System.out.println(result);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        var result = s.maxProfit(new int[]{7,6,4,3,1});
        System.out.println(result);
    }
}
