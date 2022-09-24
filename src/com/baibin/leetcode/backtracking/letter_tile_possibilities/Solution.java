package com.baibin.leetcode.backtracking.letter_tile_possibilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private char[] chars;
    private Set<String> answers = new HashSet<>();
    private boolean[] selected;
    private List<Character> solution = new ArrayList<>();

    public int numTilePossibilities(String tiles) {
        chars = tiles.toCharArray();
        selected = new boolean[chars.length];
        dfs();
        return answers.size();
    }

    private void dfs() {
        add();
        for (int i = 0; i < chars.length; i++) {
            if (selected[i]) {
                continue;
            }
            selected[i] = true;
            solution.add(chars[i]);
            dfs();
            solution.remove(solution.size() - 1);
            selected[i] = false;
        }
    }

    private void add() {
        if (solution.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Character s : solution) {
            sb.append(s);
        }
        answers.add(sb.toString());
    }
}