package com.baibin.leetcode.array.pivot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        int result = s.pivotIndex(new int[]{1,7,3,6,5,6});
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        int result = s.pivotIndex(new int[]{1,2,3});
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        int result = s.pivotIndex(new int[]{2,1,-1});
        Assertions.assertEquals(0, result);
    }
}

