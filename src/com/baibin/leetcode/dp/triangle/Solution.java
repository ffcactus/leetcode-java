package com.baibin.leetcode.dp.triangle;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int depth = triangle.size();
        if (depth == 1) {
            return triangle.get(0).get(0);
        }
        List<Integer> tmp = new ArrayList<>(triangle.get(depth - 1));
        for (int d = depth - 2; d >= 0; d--) {
            int columnCount = triangle.get(d).size();
            for (int c = 0; c < columnCount; c++) {
                int a = tmp.get(c);
                int b = tmp.get(c + 1);
                int current = triangle.get(d).get(c);
                tmp.set(c, current + Math.min(a, b));
            }
        }
        return tmp.get(0);
    }
}