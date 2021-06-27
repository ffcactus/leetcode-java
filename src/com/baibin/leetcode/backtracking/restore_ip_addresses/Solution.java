package com.baibin.leetcode.backtracking.restore_ip_addresses;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    private List<String> all = new ArrayList<>();
    private Deque<String> one = new ArrayDeque<>();
    private String s;
    public List<String> restoreIpAddresses(String s) {
        this.s = s;
        dfs(0);
        return all;
    }

    private void dfs(int i) {
        if (i == s.length() && one.size() == 4) {
            all.add(toIp(one));
            return;
        }
        if (one.size() == 4) {
            return;
        }
        for (int j = i + 1; j <= s.length(); j++) {
            String sub = s.substring(i, j);
            if (validIp(sub)) {
                one.addLast(sub);
                dfs(j);
                one.removeLast();
            }
        }
    }

    private String toIp(Deque<String> one) {
        List<String> tmp = new ArrayList<>(one);
        return tmp.get(0) + '.' + tmp.get(1) + '.' + tmp.get(2) + '.' + tmp.get(3);
    }

    private boolean validIp(String s) {
        if (s.length() > 3) {
            return false;
        }
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int i = Integer.parseInt(s);
        return i >= 0 && i <= 255;
    }
}