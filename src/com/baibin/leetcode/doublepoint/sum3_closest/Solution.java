package com.baibin.leetcode.doublepoint.sum3_closest;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int minGap = Integer.MAX_VALUE;
        int answer = target;
        int currentGap;
        int left;
        int right;
        int sum;
        for (int mid = 1; mid < len - 1; mid++) {
            left = mid - 1;
            right = mid + 1;
            while (left >= 0 && right < len) {
                sum = nums[mid] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }
                currentGap = Math.abs(target - sum);
                if (currentGap < minGap) {
                    answer = sum;
                    minGap = currentGap;
                }
                if (sum > target) {
                    left--;
                }
                if (sum < target) {
                    right++;
                }
            }
        }
        return answer;
    }
}