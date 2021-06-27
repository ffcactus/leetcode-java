package com.baibin.leetcode.dp.jump_game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        Assertions.assertEquals(true, s.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        Assertions.assertEquals(false, s.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        Assertions.assertEquals(true, s.canJump(new int[]{1}));
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        Assertions.assertEquals(true, s.canJump(new int[]{2, 0}));
    }
}
