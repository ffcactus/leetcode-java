package com.baibin.leetcode.backtracking.letter_tile_possibilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        int answer = s.numTilePossibilities("AAB");
        Assertions.assertEquals(8, answer);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        int answer = s.numTilePossibilities("AAABBC");
        Assertions.assertEquals(188, answer);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        int answer = s.numTilePossibilities("V");
        Assertions.assertEquals(1, answer);
    }
}
