package com.baibin.leetcode.other;

public class Solution {

    public int bitsCount(int num) {
        int result = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            if ((num & 0x1) == 0x1) {
                result++;
            }
            num = num >>> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.bitsCount(0b10));
        System.out.println(s.bitsCount(0b111));
        System.out.println(s.bitsCount(0b1111000011110000));
    }
}
