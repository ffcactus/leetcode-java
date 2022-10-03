package com.baibin.leetcode.tree.connect;

import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution.Node n4 = new Solution.Node(4);
        Solution.Node n5 = new Solution.Node(5);
        Solution.Node n6 = new Solution.Node(6);
        Solution.Node n7 = new Solution.Node(7);
        Solution.Node n2 = new Solution.Node(2, n4, n5, null);
        Solution.Node n3 = new Solution.Node(3, n6, n7, null);
        Solution.Node n1 = new Solution.Node(1, n2, n3, null);
        Solution s = new Solution();
        s.connect(n1);
    }
}
