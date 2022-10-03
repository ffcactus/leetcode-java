package com.baibin.leetcode.tree.sortedListToBST;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        s.build(Arrays.asList(-10, -3, 0, 5, 9), 0, 4);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var root = s.build(Arrays.asList(1, 2, 3), 0, 2);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var root = s.build(Arrays.asList(1, 2, 3, 4), 0, 3);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        var root = s.build(Arrays.asList(0, 1, 2, 3, 4, 5), 0, 5);
    }
}
