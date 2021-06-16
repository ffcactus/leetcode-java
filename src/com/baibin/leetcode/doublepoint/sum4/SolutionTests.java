package com.baibin.leetcode.doublepoint.sum4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        var actual = s.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
        Assertions.assertEquals(3, actual.size());
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var actual = s.fourSum(new int[]{-3,-1,0,2,4,5}, 0);
        Assertions.assertEquals(1, actual.size());
    }
}
