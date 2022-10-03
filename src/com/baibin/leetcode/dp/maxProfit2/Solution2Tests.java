package com.baibin.leetcode.dp.maxProfit2;

import org.junit.jupiter.api.Test;

public class Solution2Tests {

    @Test
    public void testCase1() {
        Solution2 s = new Solution2();
        var result = s.maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(result);
    }

    @Test
    public void testCase2() {
        Solution2 s = new Solution2();
        var result = s.maxProfit(new int[]{1,2,3,4,5});
        System.out.println(result);
    }

    @Test
    public void testCase3() {
        Solution2 s = new Solution2();
        var result = s.maxProfit(new int[]{7,6,4,3,1});
        System.out.println(result);
    }
}
