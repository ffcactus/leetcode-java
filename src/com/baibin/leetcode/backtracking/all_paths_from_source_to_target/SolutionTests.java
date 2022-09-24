package com.baibin.leetcode.backtracking.all_paths_from_source_to_target;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        Solution s = new Solution();
        var actual = s.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}});
        System.out.println(actual);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        var actual = s.allPathsSourceTarget(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}});
        System.out.println(actual);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        var actual = s.allPathsSourceTarget(new int[][]{{4, 3, 1}, {2, 4}, {3}, {1, 4}, {}});
        System.out.println(actual);
    }
}
