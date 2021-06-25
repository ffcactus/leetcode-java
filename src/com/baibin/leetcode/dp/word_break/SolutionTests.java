package com.baibin.leetcode.dp.word_break;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        Boolean answer = s.wordBreak("leetcode", List.of("leet", "code"));
        Assertions.assertEquals(true, answer);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        Boolean answer = s.wordBreak("applepenapple", List.of("apple", "pen"));
        Assertions.assertEquals(true, answer);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        Boolean answer = s.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"));
        Assertions.assertEquals(false, answer);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        List<String> dict = new ArrayList<>();
        dict.addAll(List.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        Boolean answer = s.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                dict);
        Assertions.assertEquals(false, answer);
    }
}
