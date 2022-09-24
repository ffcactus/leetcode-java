package com.baibin.leetcode.array.merge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTests {
    @Test
    public void testCase1() {
        var s = new Solutions();
        var result = s.merge(new int[][]{{1,3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println(Arrays.deepToString(result));
    }

    @Test
    public void testCase2() {
        var s = new Solutions();
        var result = s.merge(new int[][]{{4,5}, {1, 4}});
        System.out.println(Arrays.deepToString(result));
    }
}
