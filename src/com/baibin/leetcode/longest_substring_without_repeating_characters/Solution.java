package com.baibin.leetcode.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Map<Character, Integer> window = new HashMap<>();
        while (right < s.length()) {
            char in = s.charAt(right);
            window.put(in, window.getOrDefault(in, 0) + 1);
            right++;
            while (window.get(in) > 1) {
                char out = s.charAt(left);
                window.put(out, window.getOrDefault(out, 0) - 1);
                left++;
            }
            int length = right - left;
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}





















/*
class Solution {
    public int lengthOfLongestSubstring(String s) {

    }
}
 */