package org.mwatt.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> lastSeen = new HashMap<>();

        if (s == null || s.length() <= 1) {
            return (s == null) ? 0 : s.length();
        }

        int longest = 1;
        char[] chs = s.toCharArray();

        int slow = 0;
        lastSeen.put(chs[0],0);
        int i;

        for (i=1; i < chs.length; i++) {
            char ch = chs[i];

            if (lastSeen.containsKey(ch)) {
                while(lastSeen.get(ch) >= slow) {
                    slow = lastSeen.get(ch) + 1;
                }
            }

            if (i - slow + 1 > longest) {
                longest = i - slow + 1;
            }

            lastSeen.put(ch,i);
        }


        return longest;
    }
}
