package com.baibin.leetcode.ms.string_to_integer_atoi.convert_number_to_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testInvalidInput() {
        Solution s = new Solution();
        String actual = s.toEnglish("aa");
        Assertions.assertEquals("Invalid input", actual);
    }

    @Test
    public void testOutRange1() {
        Solution s = new Solution();
        String actual = s.toEnglish("1001");
        Assertions.assertEquals("Invalid range", actual);
    }

    @Test
    public void testOutRange2() {
        Solution s = new Solution();
        String actual = s.toEnglish("-1");
        Assertions.assertEquals("Invalid range", actual);
    }

    @Test
    public void testSpecialValue1000() {
        Solution s = new Solution();
        String actual = s.toEnglish("1000");
        Assertions.assertEquals("one thousand", actual);
    }

    @Test
    public void testHundredsCase1() {
        Solution s = new Solution();
        String actual = s.toEnglish("900");
        Assertions.assertEquals("nigh hundred", actual);
    }

    @Test
    public void testHundredsCase2() {
        Solution s = new Solution();
        String actual = s.toEnglish("980");
        Assertions.assertEquals("nigh hundred and 80", actual);
    }

    @Test
    public void testHundredsCase3() {
        Solution s = new Solution();
        String actual = s.toEnglish("908");
        Assertions.assertEquals("nigh hundred and eight", actual);
    }

    @Test
    public void testHundredsCase4() {
        Solution s = new Solution();
        String actual = s.toEnglish("988");
        Assertions.assertEquals("nigh hundred and 80 eight", actual);
    }

    @Test
    public void testTensCase4() {
        Solution s = new Solution();
        String actual = s.toEnglish("90");
        Assertions.assertEquals("90", actual);
    }

}
