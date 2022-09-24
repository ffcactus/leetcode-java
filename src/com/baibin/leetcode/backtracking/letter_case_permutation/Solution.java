package com.baibin.leetcode.backtracking.letter_case_permutation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    private int length;
    private final Deque<Character> solution = new ArrayDeque<>();
    private final List<String> answers = new ArrayList<>();
    private String s;

    public List<String> letterCasePermutation(String s) {
        this.s = s;
        this.length = s.length();
        dfs(0);
        return answers;
    }

    private void dfs(int start) {
        if (start == length) {
            StringBuilder sb = new StringBuilder();
            for (Character c : solution) {
                sb.append(c);
            }
            answers.add(sb.toString());
            return;
        }
        char c = s.charAt(start);
        char next;

        solution.add(c);
        dfs(start + 1);
        solution.removeLast();

        if (Character.isUpperCase(c)) {
            next = Character.toLowerCase(c);
            solution.add(next);
            dfs(start + 1);
            solution.removeLast();
        } else if (Character.isLowerCase(c)) {
            next = Character.toUpperCase(c);
            solution.add(next);
            dfs(start + 1);
            solution.removeLast();
        }
    }
}