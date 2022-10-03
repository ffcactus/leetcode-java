package com.baibin.leetcode.divideAndConquer.findKthLargest;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        int result = s.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4);
        System.out.println(result);
    }
}
