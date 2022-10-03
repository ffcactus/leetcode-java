package com.baibin.leetcode.doublepointer.removeNthFromEnd;

import com.baibin.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        s.removeNthFromEnd(head, 2);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        s.removeNthFromEnd(head, 1);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        ListNode head = new ListNode(1, new ListNode(2));
        s.removeNthFromEnd(head, 1);
    }

}
