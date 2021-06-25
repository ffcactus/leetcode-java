package com.baibin.leetcode.dp.palindrome_partitioning;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTests {
    @Test
    public void testReduceCase1() {
        Solution s = new Solution();
        s.reduce(List.of("d", "a", "b", "a", "c"));
    }
}
