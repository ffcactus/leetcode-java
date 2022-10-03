package com.baibin.leetcode.dp.isInterleave;


public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        var c1 = s1.toCharArray();
        var c2 = s2.toCharArray();
        var c3 = s3.toCharArray();
        return isInterleave(c1, c1.length - 1, c2, c2.length - 1, c3, c3.length - 1);
    }

    //
    private boolean isInterleave(char[] c1, int end1, char[] c2, int end2, char[] c3, int end3) {
        System.out.printf("Checking %s, %s = %s\n",
                new String(c1, 0, end1 + 1),
                new String(c2, 0, end2 + 1),
                new String(c3, 0, end3 + 1));
        if (end1 == end2 && end2 == end3) {
            return true;
        }
        if (end3 == 0) {
            if (end1 == 0) {
                return c1[end1] == c3[end3];
            }
            if (end2 == 0) {
                return c2[end2] == c3[end3];
            }
        }
        boolean p1 = false, p2 = false;
        if (end1 >= 0 && c1[end1] == c3[end3]) {
            p1 = isInterleave(c1, end1 - 1, c2, end2, c3, end3 - 1);
        }
        if (p1) {
            return true;
        }

        if (end2 >= 0 && c2[end2] == c3[end3]) {
            p2 = isInterleave(c1, end1, c2, end2 - 1, c3, end3 - 1);
        }
        if (p2) {
            return true;
        }

        return false;
    }
}
