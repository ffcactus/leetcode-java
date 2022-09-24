package com.baibin.leetcode.backtracking.beautiful_arrangement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase0() {
        Solution s = new Solution();
        int count = s.countArrangement(2);
        Assertions.assertEquals(count, 2);
    }
}
