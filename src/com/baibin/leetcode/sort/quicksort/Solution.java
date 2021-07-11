package com.baibin.leetcode.sort.quicksort;

import java.util.List;

public class Solution {
    private static final int P = 10;
    public static <T extends Comparable<T>> List<T> sort(List<T> elements) {
        List<List<T>> lists = divide(elements, P);
        List<T> answer = lists.get(0);
        for (int i = 0; i < P - 1; i++) {
            answer = merge(answer, lists.get(i));
        }
        return answer;
    }

    private static <T extends Comparable<T>>  List<List<T>> divide(List<T> elements, int p) {
        // divide elements into P parts, and sort each of the part.
        return null;
    }
    
    private static <T extends Comparable<T>> List<T> merge(List<T> l1, List<T> l2) {
        // merge two sorted list.
        return null;
    }
}

