package com.baibin.leetcode.backtracking.all_paths_from_source_to_target;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int targetNode;
    private int[][] graph;
    private final List<List<Integer>> solutions = new ArrayList<>();
    private final List<Integer> solution = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        targetNode = graph.length - 1;
        dfs(0);
        return solutions;
    }

    public void dfs(int node) {
        if (solution.contains(node)) {
            return;
        }
        if (node == targetNode) {
            List<Integer> copy = new ArrayList<>(solution);
            copy.add(node);
            solutions.add(copy);
            return;
        }
        solution.add(node);
        for (int next : graph[node]) {
            dfs(next);
        }
        solution.remove(solution.size() - 1);
    }
}