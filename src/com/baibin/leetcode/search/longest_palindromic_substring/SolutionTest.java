package com.baibin.leetcode.search.longest_palindromic_substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        var answer = s.longestPalindrome("babad");
        Assertions.assertEquals("bab", answer);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var answer = s.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", answer);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var answer = s.longestPalindrome("ac");
        Assertions.assertEquals("a", answer);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        var answer = s.longestPalindrome("abababab");
        Assertions.assertEquals("abababa", answer);
    }

    @Test
    public void testCase5() {
        Solution s = new Solution();
        var answer = s.longestPalindrome("aacabdkacaa");
        Assertions.assertEquals("aca", answer);
    }

    @Test
    public void testCase6() {
        Solution s = new Solution();
        var answer = s.longestPalindrome("xaabacxcabaaxcabaax");
        Assertions.assertEquals("xaabacxcabaax", answer);
    }
}
