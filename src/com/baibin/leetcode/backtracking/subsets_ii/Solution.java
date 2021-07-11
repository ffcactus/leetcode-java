package com.baibin.leetcode.backtracking.subsets_ii;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    private final Set<Path> aws = new HashSet<>();
    private final Path path = new Path();
    private int[] nums;
    private int n;

    public static class Path {
        private final List<Integer> path;

        public Path() {
            path = new ArrayList<>();
        }

        public Path(Path path) {
            this.path = new ArrayList<>(path.toList());
        }

        public void add(Integer n) {
            path.add(n);
        }

        public void removeLast() {
            path.remove(path.size() -1);
        }

        public List<Integer> toList() {
            return path;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Path path1 = (Path) o;
            List<Integer> tmp = new ArrayList<>(path);
            Collections.sort(tmp);
            List<Integer> tmp1 = new ArrayList<>(path1.path);
            Collections.sort(tmp1);
            return Objects.equals(tmp, tmp1);
        }

        @Override
        public int hashCode() {
            List<Integer> tmp1 = new ArrayList<>(path);
            Collections.sort(tmp1);
            return Objects.hash(tmp1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        n = nums.length;
        aws.add(new Path(path));
        bfs(0);
        return aws.stream().map(Path::toList).collect(Collectors.toList());
    }

    /**
     * The BFS search recursive function that is used to find out the result.
     * @param i the index that you already selected.
     */
    private void bfs(int i) {
        if (i == n) {
            return;
        }
        for (int j = i; j < n; j++) {
            path.add(nums[j]);
            aws.add(new Path(path));
            bfs(j + 1);
            path.removeLast();
        }
    }
}