package com.baibin.leetcode.sort.meeting_room_ii;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int len = intervals.length;
        if (len < 2) {
            return 1;
        }
        int answer = 1;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (var i = 1; i < intervals.length; i++) {
            int rooms = 1;
            for (var j = i - 1; j >= 0; j--) {
                if (intervals[i][0] < intervals[j][1]) {
                    rooms++;
                }
            }
            if (rooms > answer) {
                answer = rooms;
            }
        }
        return answer;
    }
}