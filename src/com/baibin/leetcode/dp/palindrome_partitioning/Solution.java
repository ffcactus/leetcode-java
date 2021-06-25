package com.baibin.leetcode.dp.palindrome_partitioning;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> answers = new ArrayList<>();
        Queue<List<String>> queue = new LinkedList<>();
        List<String> firstAnswer = s.chars().mapToObj(c -> (char) c).map(c -> "" + c).collect(Collectors.toList());
        answers.add(firstAnswer);
        queue.offer(firstAnswer);
        while(!queue.isEmpty()) {
            List<String> tmp = reduce(queue.poll());
            if (tmp != null) {
                answers.add(tmp);
                queue.offer(tmp);
            }
        }
        return answers;
    }

    protected List<String> reduce(List<String> input) {
        var answer = new ArrayList<String>();
        boolean reduced = false;
        int i = 0;
        for (i = 0; i < input.size() - 1; i++) {
            String combine = input.get(i) + input.get(i + 1);
            if (isPalindrome(combine)) {
                answer.add(combine);
                reduced = true;
                break;
            } else {
                answer.add(input.get(i));
            }
        }
        for (;i < input.size(); i++) {
            answer.add(input.get(i));
        }
        if (reduced) {
            return answer;
        }
        return null;
    }

    private boolean isPalindrome(String s) {

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}