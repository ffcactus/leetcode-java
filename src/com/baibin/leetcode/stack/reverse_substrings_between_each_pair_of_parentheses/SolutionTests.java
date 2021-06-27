package com.baibin.leetcode.stack.reverse_substrings_between_each_pair_of_parentheses;

import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        var answer = s.reverseParentheses("(abcd)");
        System.out.println(answer);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var answer = s.reverseParentheses("(u(love)i)");
        System.out.println(answer);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var answer = s.reverseParentheses("(ed(et(oc))el)");
        System.out.println(answer);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        var answer = s.reverseParentheses("ta()usw((((a))))");
        System.out.println(answer);
    }
}
