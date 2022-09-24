package com.baibin.leetcode.backtracking.the_k_th_lexicographical_string_of_all_happy_strings_of_length_n;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    private int currentK;
    private int k;
    private static final Character[] chars = {'a', 'b', 'c'};
    private int n;
    private Deque<Character> solution = new ArrayDeque<>();
    private String answer = "";

    public String getHappyString(int n, int k) {
        this.n = n;
        this.k = k;
        dfs(-1);
        return answer;
    }

    private void dfs(int start) {
        if (answer != "") {
            return;
        }
        if (solution.size() == n) {
            currentK++;
            if (currentK == k) {
                StringBuilder sb = new StringBuilder();
                for (Character c : solution) {
                    sb.append(c);
                }
                answer = sb.toString();
            }
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (i != start) {
                solution.add(chars[i]);
                dfs(i);
                solution.removeLast();
            }
        }
    }
}
