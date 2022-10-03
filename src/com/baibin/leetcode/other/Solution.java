package com.baibin.leetcode.other;

public class Solution {
    public static int bitsCount(long N) {
        int result = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            if ((N & 0x1) == 0x1) {
                result++;
            }
            N = N >>> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(bitsCount(0b10));   // 1
        System.out.println(bitsCount(0b111));  // 3
        System.out.println(bitsCount(0b1111000011110000)); // 8
        System.out.println(bitsCount(0xffffffff)); // 32
    }
}
