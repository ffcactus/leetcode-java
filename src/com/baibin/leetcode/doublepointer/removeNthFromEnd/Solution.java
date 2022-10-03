package com.baibin.leetcode.doublepointer.removeNthFromEnd;

import com.baibin.leetcode.common.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // p1 is the pointer ahead of p2.
        ListNode dummy = new ListNode(0, head);
        ListNode p1 = head;
        ListNode p2 = dummy;
        for (p1 = head; p1 != null; p1 = p1.next) {
            if (n > 0) {
                n--;
            } else {
                p2 = p2.next;
            }
        }
        p2.next = p2.next.next;
        return dummy.next;
    }
}
