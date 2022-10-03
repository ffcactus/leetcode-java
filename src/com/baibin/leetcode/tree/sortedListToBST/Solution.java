package com.baibin.leetcode.tree.sortedListToBST;

import com.baibin.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return build(list, 0, list.size() - 1);
    }

    public TreeNode build(List<Integer> list, int start, int end) {
        if (end - start == 1) {
            return new TreeNode(list.get(end), new TreeNode(list.get(start)), null);
        }
        if (end == start) {
            return new TreeNode(list.get(start));
        }
        if (start > end) {
            return null;
        }
        int rootIndex = start + (end - start) / 2;
        System.out.println("root = " + list.get(rootIndex));
        TreeNode root = new TreeNode(list.get(rootIndex));
        root.left = build(list, start, rootIndex - 1);
        root.right = build(list, rootIndex + 1, end);
        return root;
    }
}