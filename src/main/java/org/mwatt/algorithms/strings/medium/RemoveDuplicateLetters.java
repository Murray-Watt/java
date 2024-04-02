package org.mwatt.algorithms.strings.medium;

import java.util.*;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        var solution = new LinkedList<Character>();
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastIndex = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen.contains(ch)) {
                while(!solution.isEmpty() && ch < solution.peekLast() && lastIndex.get(solution.peekLast()) > i) {
                    seen.remove(solution.removeLast());
                }

                seen.add(ch);
                solution.add(ch);
            }
        };

        StringBuilder sb = new StringBuilder(solution.size());
        for (Character ch : solution) sb.append(ch.charValue());
        return sb.toString();
    }
}
