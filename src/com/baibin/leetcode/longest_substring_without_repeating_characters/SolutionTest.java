package com.baibin.leetcode.longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testCase1() {
        var solution = new Solution();
        var actual = solution.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, actual);
    }
}
