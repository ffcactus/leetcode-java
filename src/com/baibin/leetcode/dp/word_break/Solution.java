package com.baibin.leetcode.dp.word_break;

import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Collections.sort(wordDict, Comparator.reverseOrder());
        Map<String, Boolean> memo = new HashMap<>();
        return helper(s, wordDict, memo);
    }

    private boolean helper(String s, List<String> wordDict, Map<String, Boolean> memo) {
        if (s.length() == 0) {
            // System.out.println("Checking " + s + " " + true);
            return true;
        }
        for (String header : wordDict) {
            if (s.startsWith(header)) {
                String rest = s.substring(header.length());
                Boolean known = memo.get(rest);
                if (known != null) {
                    return known;
                }
                boolean answer = helper(rest, wordDict, memo);
                // System.out.println("Checking " + s + " " + answer);
                if (answer) {
                    memo.put(rest, true);
                    return true;
                } else {
                    memo.put(rest, false);
                }
            }
        }
        // System.out.println("Checking " + s + " " + false);
        return false;
    }
}