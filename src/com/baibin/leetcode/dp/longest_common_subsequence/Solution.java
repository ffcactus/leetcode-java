package com.baibin.leetcode.dp.longest_common_subsequence;

class Solution {
//    public int longestCommonSubsequence(String text1, String text2) {
//        if (text1.length() == 0 || text2.length() == 0) {
//            // System.out.printf("%s, %s, %d\n", text1, text2, 0);
//            return 0;
//        }
//        char c1 = text1.charAt(text1.length() - 1);
//        char c2 = text2.charAt(text2.length() - 1);
//        String rest1 = text1.substring(0, Math.max(text1.length() - 1, 0));
//        String rest2 = text2.substring(0, Math.max(text2.length() - 1, 0));
//        if (c1 == c2) {
//            int t = 1 + longestCommonSubsequence(rest1, rest2);
//            // System.out.printf("%s, %s, %d\n", text1, text2, t);
//            return t;
//        } else {
//            int t = Math.max(longestCommonSubsequence(text1, rest2), longestCommonSubsequence(rest1, text2));
//            // System.out.printf("%s, %s, %d\n", text1, text2, t);
//            return t;
//        }
//    }

    public int longestCommonSubsequence(String text1, String text2) {
        int rows = text1.length();
        int columns = text2.length();
        if (rows == 0 || columns == 0) {
            return 0;
        }
        int[][] table = new int[rows + 1][columns + 1];
        for (int row = 1; row < rows + 1; row++) {
            for (int column = 1; column < columns + 1; column++) {
                if (text1.charAt(row - 1) == text2.charAt(column - 1)) {
                    table[row][column] = 1 + table[row - 1][column - 1];
                } else {
                    table[row][column] = Math.max(table[row -1][column], table[row][column - 1]);
                }
            }
        }
        return table[rows][columns];
    }
}