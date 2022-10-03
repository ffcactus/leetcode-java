package com.baibin.leetcode.dp.isInterleave;

import org.junit.jupiter.api.Test;

public class SoutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        var result = s.isInterleave("ab", "c", "acb");
        System.out.println(result);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var result = s.isInterleave("c", "ab", "acb");
        System.out.println(result);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var result = s.isInterleave("1", "2", "a1");
        System.out.println(result);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        var result = s.isInterleave("", "", "");
        System.out.println(result);
    }

    @Test
    public void testCase8() {
        Solution s = new Solution();
        var result = s.isInterleave("aabcc", "dbbca", "aadbbcbcac");
        System.out.println(result);
    }

    @Test
    public void testCase9() {
        Solution s = new Solution();
        var result = s.isInterleave("aabcc", "dbbca", "aadbbbaccc");
        System.out.println(result);
    }

    @Test
    public void testCase10() {
        Solution s = new Solution();
        var result = s.isInterleave("aabc", "abad", "aabadabc");
        System.out.println(result);
    }
}
