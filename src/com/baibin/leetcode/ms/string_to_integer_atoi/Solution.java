package com.baibin.leetcode.ms.string_to_integer_atoi;

class Solution {
    public int myAtoi(String s) {
        var chars = s.trim().toCharArray();
        long ret = 0;
        long next = 0;
        long k = 1;
        boolean isNagtive = false;
        boolean hasSign = false;
        for (char c : chars) {
            ret = next;
            if (c >= '0' && c <= '9') {
                ret = ret + (c - '0');
                hasSign = true;
            } else if (c == '+') {
                if (hasSign) {
                    return 0;
                }
                hasSign = true;
                continue;
            } else if (c == '-') {
                if (hasSign) {
                    return 0;
                }
                hasSign = true;
                isNagtive = true;
                continue;
            } else {
                ret /= 10;
                break;
            }
            if (ret > Integer.MAX_VALUE) break;
            if (ret < Integer.MIN_VALUE) break;
            next = ret * 10;
        }
        if (isNagtive) ret = -ret;
        if (ret > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ret < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) ret;
    }
}