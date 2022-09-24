package com.baibin.leetcode.backtracking.the_k_th_lexicographical_string_of_all_happy_strings_of_length_n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase0() {
        Solution s = new Solution();
        String answer = s.getHappyString(1, 3);
        Assertions.assertEquals("c", answer);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        String answer = s.getHappyString(1, 4);
        Assertions.assertEquals("", answer);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        String answer = s.getHappyString(3, 9);
        Assertions.assertEquals("cab", answer);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        String answer = s.getHappyString(2, 7);
        Assertions.assertEquals("", answer);
    }

    @Test
    public void testCase5() {
        Solution s = new Solution();
        String answer = s.getHappyString(10, 100);
        Assertions.assertEquals("abacbabacb", answer);
    }
}
