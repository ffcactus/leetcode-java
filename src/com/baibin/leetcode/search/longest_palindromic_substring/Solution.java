package com.baibin.leetcode.search.longest_palindromic_substring;

public class Solution {
    private static final int Unknown = 0;
    private static final int True = 1;
    private static final int False = 2;
    /**
     * Find the longest palindrome by using dynamic programming.
     * for dp[left][right]:
     *    If left == right, it's true.
     *    Else if right == left + 1, if s[left]=s[right], it's true.
     *    Else dp[left][right] = dp[left+1][right-1] && s[left] == s[right].
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int leftAnswer = 0;
        int rightAnswer = 0;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int right = 1; right < len; right ++) {
            for (int left = 0; left < right; left++) {
                if (right == left + 1) {
                    if (s.charAt(left) == s.charAt(right)) {
                        dp[left][right] = True;
                        if (right - left > rightAnswer - leftAnswer) {
                            rightAnswer = right;
                            leftAnswer = left;
                        }
                    } else {
                        dp[left][right] = False;
                    }
                } else {
                    dp[left][right] = helper(left, right, s, dp);
                    if (dp[left][right] == True) {
                        if (right - left > rightAnswer - leftAnswer) {
                            rightAnswer = right;
                            leftAnswer = left;
                        }
                    }
                }
            }
        }

        return s.substring(leftAnswer, rightAnswer + 1);
    }

    private int helper(int left, int right, String s, int[][] dp) {
        int current = dp[left][right];
        if (current == True) {
            return True;
        } else if (current == False){
            return False;
        } else {
            int inner = helper(left + 1, right - 1, s, dp);
            dp[left + 1][right - 1] = inner;
            if (inner == True) {
                if (s.charAt(left) == s.charAt(right)) {
                    return True;
                }
            }
            return False;
        }
    }
}
