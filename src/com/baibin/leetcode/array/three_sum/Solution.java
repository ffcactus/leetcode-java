package com.baibin.leetcode.array.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return null;
        }
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        // i <= left <= right
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return ret;
            }
            // remove duplication.
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            var current = nums[i];
            var left = i + 1;
            var right = nums.length - 1;
            while (left < right) {
                var sum = current + nums[left] + nums[right];
                if (sum == 0) {
                    ret.add(List.of(current, nums[left], nums[right]));
                    while (left < right && nums[left + 1] == nums[left]) left++;
                    while (left < right && nums[right - 1] == nums[right]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ret;
    }
}