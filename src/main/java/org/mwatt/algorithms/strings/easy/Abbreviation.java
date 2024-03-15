package org.mwatt.algorithms.strings.easy;

public class Abbreviation {
    public boolean validWordAbbreviation1(String word, String abbr) {
        int skip;
        int index = 0;
        int abbrIndex = 0;

        if (word.isEmpty()) {
            return abbr.isEmpty();
        }

        while ((index < word.length()) && (abbrIndex < abbr.length())) {
            char ch = abbr.charAt(abbrIndex);

            if (!Character.isDigit(ch)) {
                if (word.charAt(index) == ch) {
                    index++;
                    abbrIndex++;
                } else{
                    return false;
                }
            } else {
                skip = (int) ch - '0';
                abbrIndex++;

                while (abbrIndex <  abbr.length()) {
                    if (skip == 0) {
                        return false;
                    }

                    ch = abbr.charAt(abbrIndex);

                    if (Character.isDigit(ch)) {
                        skip = skip * 10 + ch - '0';
                        abbrIndex++;
                    } else {
                        break;
                    }
                }
                index += skip;

            }
        }

        return index == word.length() && abbrIndex == abbr.length();
    }

    public boolean validWordAbbreviation2(String word, String abbr) {
        if (word == null || abbr == null) {
            throw new IllegalArgumentException("Input is null");
        }

        int wordLen = word.length();
        int abbrLen = abbr.length();

        if (abbrLen > wordLen) {
            return false;
        }

        if (wordLen == 0) {
            return true;
        }

        int wi = 0;
        int ai = 0;

        while (wi < wordLen && ai < abbrLen) {
            if (word.charAt(wi) == abbr.charAt(ai)) {
                wi++;
                ai++;
                continue;
            }

            // Short circuit if abbr has a leading zero
            if (abbr.charAt(ai) == '0' || !Character.isDigit(abbr.charAt(ai))) {
                return false;
            }

            // figure out the number
            int num = 0;
            while (ai < abbrLen && Character.isDigit(abbr.charAt(ai))) {
                num = 10 * num + (abbr.charAt(ai) - '0');
                ai++;
            }

            // Increment word index by num.
            wi += num;
        }

        // if we have reached the end of both word and abbr, then it is a valid abbreviation
        return wi == wordLen && ai == abbrLen;
    }
}
