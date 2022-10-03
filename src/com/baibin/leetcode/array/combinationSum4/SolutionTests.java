package com.baibin.leetcode.array.combinationSum4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        var s = new Solution();
        var count = s.combinationSum4(new int[] {1, 2, 3}, 4);
        Assertions.assertEquals(7, count);
    }

    @Test
    public void testCase2() {
        var s = new Solution();
        var count = s.combinationSum4(new int[] {9}, 3);
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testCase3() {
        var s = new Solution();
        var count = s.combinationSum4(new int[] {1, 50}, 200);
        Assertions.assertEquals(28730, count);
    }

    @Test
    public void testCase4() {
        var s = new Solution();
        var count = s.combinationSum4(new int[] {2, 1, 3}, 35);
        Assertions.assertEquals(1132436852, count);
    }
}
