package com.baibin.leetcode.dp.triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTests {
    @Test
    public void testCase1() {
        List<List<Integer>> input = List.of(List.of(2), List.of(3,4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
        Solution s = new Solution();
        int actual = s.minimumTotal(input);
        Assertions.assertEquals(11, actual);
    }
}
