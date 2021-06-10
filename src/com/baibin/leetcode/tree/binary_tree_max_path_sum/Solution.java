package com.baibin.leetcode.tree.binary_tree_max_path_sum;

import com.baibin.leetcode.tree.TreeNode;

public class Solution {
    private int answer = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        path(root);
        return answer;
    }

    public int path(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = Math.max(0, path(root.left));
        int maxRight = Math.max(0, path(root.right));
        // In the return value, the only one side should be considered.
        // In the final answer, both side should be considered.
        int current = Math.max(maxLeft, maxRight) + root.val;
        answer = Math.max(answer, maxLeft + maxRight + root.val);
        System.out.printf("Node %d, left = %d, right = %d, current = %d, answer = %d\n", root.val, maxLeft, maxRight, current, answer);
        return current;
    }
}