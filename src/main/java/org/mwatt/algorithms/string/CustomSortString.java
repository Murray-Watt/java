package org.mwatt.algorithms.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomSortString {
    public String customSortString(String order, String s) {
        int[] weights = new int[26];
        int length = order.length();
        char[] orderChars = new char[length];
        order.getChars(0,length,orderChars,0);

        for(int i=0; i < 26; i++) {
            weights[i] = 25;
        }

        int weight = 0;
        for (char ch : orderChars) {
            int index = ch - (int) 'a';
            weights[index] = weight;
            weight++;
        }

        List<Character> chars = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }

        chars.sort(Comparator.comparingInt(ch -> weights[ch - 'a']));

        StringBuilder sb = new StringBuilder();

        for (Character ch : chars) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public String customSortStringCondensed(String order, String s) {
        int[] weights = new int[26];

        for(int i=0; i < 26; i++) {
            weights[i] = 25;
        }

        int weight = 0;
        for (char ch : order.toCharArray()) {
            weights[ch - 'a'] = weight++;
        }




        List<Character> chars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }

        chars.sort(Comparator.comparingInt(ch -> weights[ch - 'a']));

        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public String customSortStringOptimized(String order, String s) {
        // Count characters in s
        int[] counts = new int[26];
        for (char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }

        // Build the sorted string based on the order and counts
        StringBuilder sb = new StringBuilder();
        for (char ch : order.toCharArray()) {
            sb.append(String.valueOf(ch).repeat(counts[ch - 'a']));
            counts[ch - 'a'] = 0;
        }

        // Append any remaining characters from s that are not in order
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(String.valueOf(ch).repeat(counts[ch - 'a']));
        }

        return sb.toString();
    }
}
