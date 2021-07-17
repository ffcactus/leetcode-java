package com.baibin.leetcode.ms.test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    Set<String> records = new HashSet<>();
    List<Integer> solution = new ArrayList<>();
    Set<Integer> selectedIndies = new HashSet<>();
    int aws;

    public int solution(int A, int B, int C, int D) {
        List<Integer> l = new ArrayList<>();
        l.add(A);
        l.add(B);
        l.add(C);
        l.add(D);
        bfs(l, 0);
        return records.size();
    }

    private boolean isValid() {
        if (solution.size() != 4) {
            return false;
        }
        int a = solution.get(0);
        int b = solution.get(1);
        int c = solution.get(2);
        int d = solution.get(3);
        int h = a * 10 + b;
        int m = c * 10 + d;
        return h >= 0 && h <= 23 && m >= 0 && m <= 59;
    }

    private void bfs(List<Integer> nums, int i) {
        if (solution.size() == 4) {
            if (isValid()) {
                records.add(solution.toString());
                aws++;
            }
            return;
        }
        for (int j = 0; j < 4; j++) {
            if (!selectedIndies.contains(j)) {
                solution.add(nums.get(j));
                selectedIndies.add(j);
                bfs(nums, j);
                solution.remove(solution.size() - 1);
                selectedIndies.remove(j);
            }
        }

    }
}

