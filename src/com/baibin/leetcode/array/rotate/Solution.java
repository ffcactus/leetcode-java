package com.baibin.leetcode.array.rotate;

public class Solution {
    private static class Location {
        public int x;
        public int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int deepth = 0;
        var result = new int[size][size];
        while (deepth <= size / 2) {
            var topLeft = new Location(deepth, deepth);
            var topRight = new Location(size - deepth - 1, deepth);
            var bottomLeft = new Location(deepth, size - deepth - 1);
            var bottomRight = new Location(size - deepth - 1, size - deepth - 1);
            var newSize = size - 2 * deepth;
            // move top line.
            for (int i = 0; i < newSize; i++) {
                int oldX = topLeft.x + i;
                int oldY = topLeft.y;
                int newX = topRight.x;
                int newY = topRight.y+ i;
                result[newY][newX] = matrix[oldY][oldX];
            }
            // move right line.
            for (int i = 0; i < newSize; i++) {
                int oldX = topRight.x;
                int oldY = topRight.y + i;
                int newX = bottomRight.x - i;
                int newY = bottomLeft.y;
                result[newY][newX] = matrix[oldY][oldX];
            }
            // move bottom line.
            for (int i = 0; i < newSize; i++) {
                int oldX = bottomRight.x - i;
                int oldY = bottomRight.y;
                int newX = bottomLeft.x;
                int newY = bottomLeft.y - i;
                result[newY][newX] = matrix[oldY][oldX];
            }
            // move left line.
            for (int i = 0; i < newSize; i++) {
                int oldX = bottomLeft.x;
                int oldY = bottomLeft.y - i;
                int newX = topLeft.x + i;
                int newY = topLeft.y;
                result[newY][newX] = matrix[oldY][oldX];
            }
            //System.out.println(Arrays.deepToString(result));
            deepth++;
        }
        for(int i = 0; i < matrix.length; i++)
            matrix[i] = result[i].clone();
    }
}
