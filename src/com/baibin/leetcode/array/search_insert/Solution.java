package com.baibin.leetcode.array.search_insert;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        // System.out.printf("Array = %s, Target = %d\n", Arrays.toString(nums), target);
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            // System.out.printf("Left = %d, Right = %d, Middle = %d\n", left, right, middle);
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
