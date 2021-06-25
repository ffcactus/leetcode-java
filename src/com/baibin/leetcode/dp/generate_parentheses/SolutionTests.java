package com.baibin.leetcode.dp.generate_parentheses;

import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(1));
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(2));
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(3));
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(4));
    }
}
