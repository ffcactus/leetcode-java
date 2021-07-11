package com.baibin.leetcode.ms.string_to_integer_atoi.convert_number_to_string;

public class Solution {
    private static final String[] mappingDigital1 = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nigh", "ten"};
    private static final String[] mappingDigital2 = new String[]{"", "ten", "20", "30", "40", "50", "60", "70", "80", "90"};

    public String toEnglish(String num) {
        int n;
        try {
            n = Integer.parseInt(num);
        } catch (Exception e) {
            return "Invalid input";
        }
        if (n > 1000 || n < 0) {
            return "Invalid range";
        }
        if (n == 1000) {
            return "one thousand";
        }
        StringBuilder sb = new StringBuilder();
        if (n > 99) {
            int num3 = n / 100;
            sb.append(mappingDigital1[num3]).append(" ").append("hundred");
            int rest3 = n % 100;
            if (rest3 == 0) {
                return sb.toString();
            }
            sb.append(" ").append("and").append(" ");
            sb.append(toEnglishLessThan100(n % 100));
        }
        return sb.toString();
    }

    public String toEnglishLessThan100(int n) {
        int num2 = n / 10;
        if (num2 == 0) {
            return toEnglishLessThen10(n % 10);
        } else {
            // 整10，例如80.
            if (n % 10 == 0) {
                return mappingDigital2[num2];
            }
            return mappingDigital2[num2] + " " + toEnglishLessThen10(n % 10);
        }
    }

    public String toEnglishLessThen10(int n) {
        return mappingDigital1[n];
    }
}
