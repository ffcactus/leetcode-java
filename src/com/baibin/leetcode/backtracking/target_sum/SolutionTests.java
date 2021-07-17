package com.baibin.leetcode.backtracking.target_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        int answer = s.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
        Assertions.assertEquals(5, answer);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        int answer = s.findTargetSumWays(new int[]{1}, 1);
        Assertions.assertEquals(1, answer);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        int answer = s.findTargetSumWays(new int[]{1}, 2);
        Assertions.assertEquals(0, answer);
    }
}
