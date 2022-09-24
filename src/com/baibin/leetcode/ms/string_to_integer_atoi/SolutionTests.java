package com.baibin.leetcode.ms.string_to_integer_atoi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

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

    @Test
    public void testCase5() {
        String s = "apple:2,orange:3,apple:1,pear:2";
        var map = Arrays.stream(s.split(",")).sequential().collect(Collectors.groupingBy(s1 -> s1.split(":")[0], Collectors.summingInt(s2 -> Integer.parseInt(s2.split(":")[1]))));
        System.out.println(map);
    }
}
