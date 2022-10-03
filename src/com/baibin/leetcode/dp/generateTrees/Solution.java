package com.baibin.leetcode.dp.generateTrees;

import com.baibin.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }

    private List<TreeNode> generate(int start, int end) {
        List<TreeNode> all = new ArrayList<>();
        if (start > end) {
            all.add(null);
            return all;
        }
        for (int i = start; i <= end; i++) {
            var possibleLeft = generate(start, i - 1);
            var possibleRight= generate(i + 1, end);
            for (TreeNode left : possibleLeft) {
                for (TreeNode right: possibleRight) {
                    TreeNode root = new TreeNode(i, left, right);
                    all.add(root);
                }
            }
        }
        return all;
    }
}
