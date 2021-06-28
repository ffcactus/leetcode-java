package com.baibin.leetcode.tree.serialize_and_deserialize_binary_tree;

import com.baibin.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    public static final String Null = "X";
    public static final String Delimiter = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return Null;
        }
        return root.val + Delimiter + serialize(root.left) + Delimiter + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(Delimiter)));
        return helper(queue);
    }

    private TreeNode helper(Queue<String> queue) {
        String s = queue.poll();
        if (s == null) {
            throw new RuntimeException("bad serialize input.");
        }
        if (s.equals(Null)) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = helper(queue);
        node.right = helper(queue);
        return node;
    }
}
