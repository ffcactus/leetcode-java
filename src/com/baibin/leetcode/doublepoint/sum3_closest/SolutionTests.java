package com.baibin.leetcode.doublepoint.sum3_closest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        var actual = s.threeSumClosest(new int[]{-1,2,1,-4}, 1);
        Assertions.assertEquals(2, actual);
    }
}
