package com.baibin.leetcode.tree.recoverTree;

import com.baibin.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void testCase1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4, n2, null);
        TreeNode n3 = new TreeNode(3, n1, n4);

        Solution s = new Solution();
        s.recoverTree(n3);
    }

    @Test
    public void testCase2() {
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3, null, n2);
        TreeNode n1 = new TreeNode(1, n3, null);

        Solution s = new Solution();
        s.recoverTree(n1);
    }
}
