package com.baibin.leetcode.ms.test1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int N) {
        Set<Integer> aws = new HashSet<>();
        if (N % 2 == 1) {
            aws.add(0);
        }
        for (int i = 1; i <= N / 2; i++) {
            aws.add(i);
            aws.add(-i);
        }

        return toInt(aws);
    }

    private int[] toInt(Set<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }
}
