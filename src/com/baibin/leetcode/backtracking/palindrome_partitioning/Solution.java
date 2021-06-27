package com.baibin.leetcode.backtracking.palindrome_partitioning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    private List<List<String>> answer = new ArrayList<>();
    private Deque<String> chooses = new ArrayDeque<>();

    public List<List<String>> partition(String s) {
        dfs(0, s);
        return answer;
    }

    private void dfs(int i, String s) {
        if (i == s.length()) {
            answer.add(new ArrayList<>(chooses));
            return;
        }

        for (int j = i + 1; j <= s.length(); j++) {
            String choose = s.substring(i, j);
            if (isPalindrome(choose)) {
                chooses.addLast(choose);
                dfs(j, s);
                chooses.removeLast();
            }
        }
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}