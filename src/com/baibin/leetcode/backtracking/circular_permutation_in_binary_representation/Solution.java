package com.baibin.leetcode.backtracking.circular_permutation_in_binary_representation;

import java.util.*;

public class Solution {
    private boolean[] used;
    private int count;
    private Deque<Integer> solution = new ArrayDeque<>();
    private List<Integer> answer = new ArrayList<>();
    private Map<Integer, List<Integer>> mapping = new HashMap<>();

    public List<Integer> circularPermutation(int n, int start) {
        this.count = 1 << n;
        this.used = new boolean[count];
        prepare();
        used[start - 1] = true;
        solution.add(start);
        dfs();
        return answer;
    }

    private void dfs() {
        System.out.println(solution);
        if (!answer.isEmpty()) {
            return;
        }
        if (solution.size() == count) {
            if (valid(solution.peekFirst(), solution.peekLast())) {
                answer.addAll(solution);
            }
            return;
        }
        for (int i = 0; i < count; i++) {
            if (used[i]) {
                continue;
            }
            if (!solution.isEmpty()) {
                if (valid(i, solution.peekLast())) {
                    solution.add(i);
                    used[i] = true;
                    dfs();
                    used[i] = false;
                    solution.removeLast();
                }
            }
        }
    }

    private void prepare() {
        for (int i = 0; i < count; i++) {
            List<Integer> bin = new ArrayList<>();
            bin.add((i & 0b10000) > 0? 1 : 0);
            bin.add((i & 0b01000) > 0? 1 : 0);
            bin.add((i & 0b00100) > 0? 1 : 0);
            bin.add((i & 0b00010) > 0? 1 : 0);
            bin.add((i & 0b00001) > 0? 1 : 0);
            mapping.put(i, bin);
        }
    }

    private boolean valid(int a, int b) {
        var as = mapping.get(a);
        var bs = mapping.get(b);
        int diff = 0;
        for (int i = 0; i < as.size(); i++) {
            if (!as.get(i).equals(bs.get(i))) {
                diff++;
            }
            if (diff > 1) {
                break;
            }
        }
        return diff == 1;
    }
}
