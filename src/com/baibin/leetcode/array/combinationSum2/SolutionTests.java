package com.baibin.leetcode.array.combinationSum2;

import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        // 1, 1, 2, 4, 5, 6, 7, 10
        var resutls = s.combinationSum2(new int[]{1, 2, 3, 4}, 4);
        System.out.println(resutls.toString());
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var resutls = s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        System.out.println(resutls.toString());
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var resutls = s.combinationSum2(new int[]{2,5,2,1,2}, 5);
        System.out.println(resutls.toString());
    }
}
