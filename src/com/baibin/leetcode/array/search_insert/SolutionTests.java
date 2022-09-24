package com.baibin.leetcode.array.search_insert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        int actual = s.searchInsert(new int[]{1,3,5,6}, 5);
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        int actual = s.searchInsert(new int[]{1,3,5,6}, 2);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        int actual = s.searchInsert(new int[]{1,3,5,6}, 7);
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        int actual = s.searchInsert(new int[]{1,3,5,6}, 0);
        Assertions.assertEquals(0, actual);
    }
}
