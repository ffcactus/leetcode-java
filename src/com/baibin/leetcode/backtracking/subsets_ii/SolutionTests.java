package com.baibin.leetcode.backtracking.subsets_ii;

import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        var aws = s.subsetsWithDup(new int[]{1, 2, 2});
        System.out.println(aws);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var aws = s.subsetsWithDup(new int[]{0});
        System.out.println(aws);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var aws = s.subsetsWithDup(new int[]{4, 4, 4, 1, 4});
        System.out.println(aws);
    }
}
