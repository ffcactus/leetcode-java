package com.baibin.leetcode.tree.recoverTree;

import com.baibin.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void recoverTree(TreeNode root) {
        List<TreeNode> all = new ArrayList<>();
        dfs(root, all);
        TreeNode x = null;
        TreeNode y = null;
        for (int i = 0; i < all.size() - 1; i++) {
            if (all.get(i).val > all.get(i + 1).val) {
                y = all.get(i + 1);
                if (x == null) {
                    x = all.get(i);
                } else {
                    break;
                }
            }
        }
        if (x != null && y != null) {
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }

    private void dfs(TreeNode root, List<TreeNode> path) {
        if (root == null) {
            return;
        }
        dfs(root.left, path);
        path.add(root);
        dfs(root.right, path);
    }
}
