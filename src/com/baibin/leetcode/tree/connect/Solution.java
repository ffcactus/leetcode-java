package com.baibin.leetcode.tree.connect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> all = new LinkedList<>();
        int size = 1;
        root.next = null;
        all.offer(root);

        while(all.peek().left != null) {
            List<Node> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node n = all.poll();
                row.add(n.left);
                row.add(n.right);
            }
            for (int k = 0; k < row.size() - 1; k++) {
                row.get(k).next = row.get(k + 1);
            }
            Node rowEnd = row.get(row.size() - 1);
            rowEnd.next = null;
            if (rowEnd.left != null) {
                all.addAll(row);
                size = size * 2;
            } else {
                break;
            }
        }
        return root;
    }
}
