package com.baibin.leetcode.doublepoint.sum4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        int len = nums.length;
        if (len < 4) {
            return answer;
        }
        Arrays.sort(nums);
        int ml;
        int mr;
        int ll = 0;
        int rr = len - 1;
        int sum = 0;
        while (rr - ll > 2) {
            ml = ll + 1;
            mr = rr - 1;
            while (ml < mr) {
                sum = nums[ll] + nums[ml] + nums[mr] + nums[rr];
                System.out.printf("Check %d %d %d %d, sum = %d\n", ll, ml, mr, rr, sum);
                if (sum == target) {
                    answer.add(List.of(nums[ll], nums[ml], nums[mr],nums[rr]));
                    ml++;
                    mr--;
                } else if (sum < target) {
                    ml++;
                } else {
                    mr--;
                }
            }
            ll++;
            rr--;
        }
        return answer;
    }
}
// 0 1 4 5
// 0 2 3 5
// 1 2 3 4