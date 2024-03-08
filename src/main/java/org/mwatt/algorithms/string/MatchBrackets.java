package org.mwatt.algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MatchBrackets {

    // Uses a StringBuilder to remove matching brackets
    // Returns true if the string is valid, false otherwise
    public boolean isValidStringBuilder(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        StringBuilder str = new StringBuilder(s);

        char previous = str.charAt(0);
        int previousIndex = 0;

        System.out.println(previous);

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            System.out.println(current);
            if (current == '}') {
                if (previousIndex == -1) return false;
                if (previous == '{') {
                    str.deleteCharAt(previousIndex);
                    str.deleteCharAt(previousIndex);
                    previousIndex--;
                } else {
                    return false;
                }
            } else if (current == ')') {
                if (previousIndex == -1) return false;
                if (previous == '(') {
                    str.deleteCharAt(previousIndex);
                    str.deleteCharAt(previousIndex);
                    previousIndex--;
                } else {
                    return false;
                }
            } else if (current == ']') {
                if (previousIndex == -1) return false;
                if (previous == '[') {
                    str.deleteCharAt(previousIndex);
                    str.deleteCharAt(previousIndex);
                    previousIndex--;
                } else {
                    return false;
                }
            } else {
                previousIndex++;
            }

            previous = (previousIndex == -1) ? '*' : str.charAt(previousIndex);
            System.out.println(previousIndex + ":" + previous);
        }

        return previousIndex == -1;
    }

    // Uses an array-based stack to track bracket matches
    // Returns true if the string is valid, false otherwise
    public boolean isValidTimeOptimized(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        char[] stack = new char[s.length()];
        int stackIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '}') {
                if (stackIndex == 0) return false;
                if (stack[stackIndex - 1] == '{') {
                    stackIndex--;
                } else {
                    return false;
                }
            } else if (current == ')') {
                if (stackIndex == 0) return false;
                if (stack[stackIndex - 1] == '(') {
                    stackIndex--;
                } else {
                    return false;
                }
            } else if (current == ']') {
                if (stackIndex == 0) return false;
                if (stack[stackIndex - 1] == '[') {
                    stackIndex--;
                } else {
                    return false;
                }
            } else {
                stack[stackIndex] = current;
                stackIndex++;
            }
        }

        return stackIndex == 0;
    }

    // Uses a stack without a map to track bracket matches
    // Returns true if the string is valid, false otherwise
    public boolean isValidNoMap(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '}') {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (current == ')') {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (current == ']') {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(current);
            }
        }

        return stack.isEmpty();
    }

    private final Map<Character, Character> mappings = new HashMap<>() {{
        put(')', '(');
        put('}', '{');
        put(']', '[');
    }};

    // Uses a stack and a map to track bracket matches
    // Returns true if the string is valid, false otherwise
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mappings.containsKey(c)) {
                if (stack.empty()) {
                    return false;
                }

                char m = stack.pop();

                if (m != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
