package com.baibin.leetcode.dp.longest_common_subsequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        int actual = s.longestCommonSubsequence("abcde", "ace");
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        int actual = s.longestCommonSubsequence("ab", "a");
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        int actual = s.longestCommonSubsequence("bsbininm", "jmjkbkjkv");
        Assertions.assertEquals(1, actual);
    }
}
