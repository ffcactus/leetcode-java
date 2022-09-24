package com.baibin.leetcode.array.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solutions {
    public int[][] merge(int[][] intervals) {
        var list = Arrays.stream(intervals).sorted((a, b) -> {
            if (a[0] < b[0]) {
                return -1;
            } else if (a[0] > b[0]){
                return 1;
            } else {
                return Integer.compare(a[1], b[1]);
            }
        }).collect(Collectors.toList());
        var result = new ArrayList<int[]>();
        var bar = new int[2];
        bar = list.get(0);
        for (var current : list) {
            if (current[0] > bar[1]) {
                result.add(bar);
                bar = current;
            }
            if (current[1] > bar[1]) {
                bar[1] = current[1];
            }
        }
        result.add(bar);
        return result.toArray(new int[][]{});
    }
}
