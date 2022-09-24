package com.baibin.leetcode.backtracking.circular_permutation_in_binary_representation;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase0() {
        Solution s = new Solution();
        var answer = s.circularPermutation(2, 3);
        System.out.println(answer);
    }
}
