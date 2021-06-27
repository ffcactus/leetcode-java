package com.baibin.leetcode.backtracking.combinations;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        List<List<Integer>> answer = s.combine(3, 0);
        System.out.println(answer);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        List<List<Integer>> answer = s.combine(3, 2);
        System.out.println(answer);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        List<List<Integer>> answer = s.combine(4, 2);
        System.out.println(answer);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        List<List<Integer>> answer = s.combine(4, 3);
        System.out.println(answer);
    }
}
