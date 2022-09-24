package com.baibin.leetcode.array.findDiagonalOrder;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // up = 0, down = 1;
        int direction = 0;
        int maxY = mat.length, maxX = mat[0].length;
        int x = 0, y = 0;
        int[] result = new int[maxY * maxX];
        int i = 0;
        while (i < result.length) {
            System.out.printf("[%d,%d] = %d, %s\n", x, y, mat[y][x], direction == 0 ? "up": "down");
            result[i] = mat[y][x];
            i++;
            if (direction == 0) {
                x += 1;
                y -= 1;
                if (y < 0 && x < maxX) {
                    direction = 1;
                    y += 1;
                }
                if (y < 0 && x == maxX) {
                    direction = 1;
                    y += 2;
                    x -= 1;
                }
                if (y >= 0 && x == maxY) {
                    direction = 1;
                    y += 2;
                    x -= 1;
                }
            } else {
                x -= 1;
                y += 1;
                if (x < 0 && y < maxY) {
                    direction = 0;
                    x += 1;
                }
                if (x < 0 && y == maxY) {
                    direction = 0;
                    x += 2;
                    y -= 1;
                }
                if (x >=0 && y == maxY) {
                    direction = 0;
                    x += 2;
                    y -= 1;
                }
            }
            System.out.printf("next, [%d,%d], %s\n", x, y, direction == 0 ? "up": "down");
        }
        return result;
    }
}
