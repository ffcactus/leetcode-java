package com.baibin.leetcode.array.pivot;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        // System.out.println(Arrays.toString(nums));
        int cnt = nums.length;
        if (cnt == 0) {
            return -1;
        }
        int left = 0;
        int sum = Arrays.stream(nums).sum();
        int right = sum - nums[0] - left;

        for (int i = 0; i < cnt; i++) {
            // System.out.printf("Checking index nums[%d] = %d, left = %d, right = %d\n", i, nums[i], left, right);
            if (left == right) {
                return i;
            }
            left += nums[i];
            if (i < cnt - 1) {
                right -= nums[i + 1];
            } else {
                right = 0;
            }
        }
        return -1;
    }
}
