package com.baibin.leetcode.backtracking.subsets;

import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        System.out.println(s.subsets(new int[]{}));
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        System.out.println(s.subsets(new int[]{1}));
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        System.out.println(s.subsets(new int[]{1, 2, 3}));
    }
}
