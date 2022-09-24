package com.baibin.leetcode.backtracking.letter_case_permutation;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTests {

    @Test
    public void testCase0() {
        Solution s = new Solution();
        List<String> answer = s.letterCasePermutation("a1b2");
        System.out.println(answer);
    }
}
