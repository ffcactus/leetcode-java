package com.baibin.leetcode.bfs.binary_tree_level_order_traversal_ii;

import com.baibin.leetcode.tree.TreeNode;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }
        Queue<TreeNode> currentLevel = new LinkedList<>();
        currentLevel.add(root);
        while (!currentLevel.isEmpty()) {
            int size = currentLevel.size();
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                TreeNode out = Objects.requireNonNull(currentLevel.poll());
                numbers.add(out.val);
                if (out.left != null) {
                    currentLevel.offer(out.left);
                }
                if (out.right != null) {
                    currentLevel.offer(out.right);
                }
            }
            answer.add(numbers);
        }
        Collections.reverse(answer);
        return answer;
    }
}