package com.baibin.leetcode.array.combinationSum;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        var result = s.combinationSum(new int[]{2,3,5}, 8);
        System.out.printf("Result = %s", result);
    }
}
