package com.baibin.leetcode.backtracking.restore_ip_addresses;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTests {

    @Test
    public void testCase1() {
        Solution s = new Solution();
        List<String> actual = s.restoreIpAddresses("25525511135");
        System.out.println(actual);
    }

    @Test
    public void testCase2() {
        Solution s = new Solution();
        List<String> actual = s.restoreIpAddresses("0000");
        System.out.println(actual);
    }

    @Test
    public void testCase3() {
        Solution s = new Solution();
        List<String> actual = s.restoreIpAddresses("010010");
        System.out.println(actual);
    }

    @Test
    public void testCase4() {
        Solution s = new Solution();
        List<String> actual = s.restoreIpAddresses("101023");
        System.out.println(actual);
    }
}
