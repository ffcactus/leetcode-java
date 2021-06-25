package com.baibin.leetcode.dp.generate_parentheses;

import java.util.*;

class Solution {
    private List<String> answer = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        answer.clear();
        int left = n;
        int right = n;
        helper(n, n, "");
        return answer;
    }

    private void helper(int left, int right, String s) {
        if (left == 0 && right == 0) {
            answer.add(s);
            return;
        }
        if (left == right) {
            helper(left - 1, right, s + "(");
        } else if (left > 0 && left < right){
            helper(left - 1, right, s + "(");
            helper(left, right - 1, s + ")");
        } else if (left == 0 && left < right) {
            helper(left, right - 1, s + ")");
        }
    }
}