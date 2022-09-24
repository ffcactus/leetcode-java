package com.baibin.leetcode.array.set_zeroes;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void setZeroes(int[][] matrix) {
        List<int[]> zeroes = new ArrayList<>();
        int maxY = matrix.length;
        int maxX = matrix[0].length;
        if (maxX == 0) {
            return;
        }
        // find all zeroes.
        for (int y = 0; y < maxY; y++) {
            for (int x = 0; x < maxX; x++) {
                if (matrix[y][x] == 0) {
                    int[] zero = new int[2];
                    zero[0] = y;
                    zero[1] = x;
                    zeroes.add(zero);
                }
            }
        }
        // set zero lines.
        for (var zero : zeroes) {
            var y = zero[0];
            var x = zero[1];
            // set vertical line.
            for (var dy = 0; dy < maxY; dy++) {
                matrix[dy][x] = 0;
            }
            // set horizontal line.
            for (var dx = 0; dx < maxX; dx++) {
                matrix[y][dx] = 0;
            }
        }
    }
}
