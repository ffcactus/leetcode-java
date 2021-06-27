package com.baibin.leetcode.dp.jump_game_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase0() {
        Solution s = new Solution();
        Assertions.assertEquals(0, s.jump(new int[]{1}));
    }

    @Test
    public void testCase1() {
        Solution s = new Solution();
        Assertions.assertEquals(1, s.jump(new int[]{2, 1, 1}));
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        Assertions.assertEquals(2, s.jump(new int[]{2,3,1,1,4}));
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        Assertions.assertEquals(2, s.jump(new int[]{2,3,0,1,4}));
    }
}
