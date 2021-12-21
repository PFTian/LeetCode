package main.java.com.hk.gargameleo.leetcode.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringSolution {

    /**
     * @param s input string
     * @return length of longest substring
     */
    public int lengthOfLongestSubstring(String s) {

        int size = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int startIdx = 0, endIdx = 0; endIdx < s.length(); endIdx++) {
            char endVal = s.charAt(endIdx);
            if (map.containsKey(endVal)) {
                startIdx = Math.max(map.get(endVal), startIdx);
            }
            size = Math.max(size, endIdx - startIdx + 1);
            map.put(endVal, endIdx + 1);
        }

        return size;
    }

}
