package com.baibin.leetcode.dp.numDecodings;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        var result = s.numDecodings("12");
        System.out.println(result);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var result = s.numDecodings("226");
        System.out.println(result);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var result = s.numDecodings("06");
        System.out.println(result);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();

        var result = s.numDecodings("2");
        System.out.println(result);

        result = s.numDecodings("21");
        System.out.println(result);

        result = s.numDecodings("210");
        System.out.println(result);

        result = s.numDecodings("2101");
        System.out.println(result);
    }

    @Test
    public void testCase5() {
        Solution s = new Solution();

        var result = s.numDecodings("1");
        System.out.println(result);

        result = s.numDecodings("10");
        System.out.println(result);
    }

    @Test
    public void testCase6() {
        Solution s = new Solution();

        var result = s.numDecodings("1");
        System.out.println(result);

        result = s.numDecodings("11");
        System.out.println(result);

        result = s.numDecodings("112");
        System.out.println(result);

        result = s.numDecodings("1123");
        System.out.println(result);
    }
}
