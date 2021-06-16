package com.baibin.leetcode.ms.string_to_integer_atoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        var actual = s.myAtoi("42");
        assertEquals(42, actual);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var actual = s.myAtoi("   -42");
        assertEquals(-42, actual);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var actual = s.myAtoi("4193 with words");
        assertEquals(4193, actual);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        var actual = s.myAtoi("-91283472332");
        assertEquals(-2147483648, actual);
    }
}
