package org.mwatt.tutorial.classes;

import java.util.Deque;
import java.util.LinkedList;

// "/home/"
// "/home//foo/"
// "/home/user/Documents/../Pictures"
// "/.../a/../b/c/../d/./"
// "/../"
// "/a/./b/../../c/"
// "/home/of/foo/../../bar/../../is/./here/."

public class CanonicalPath {
    public static void log(String s) {
        System.out.println(s);
    }

    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Deque<String> stack = new LinkedList<>();

        for (String part : parts) {
            if (!part.isEmpty() && !part.equals(".")) {
                stack.push(part);
            }
        }


        Deque<String> result = new LinkedList<>();

        while(!stack.isEmpty()) {
            String part = stack.pop();
            switch(part) {
                case "..":
                    int pops = 1;
                    while (!stack.isEmpty() && pops > 0) {
                        String next = stack.pop();
                        if (next.equals("..")) {
                            pops++;
                        } else {
                            pops--;
                        }
                    }

                    break;
                default:
                    result.push(part);
            }
        }

        if (result.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();

        while(!result.isEmpty()) {
            sb.append('/');
            sb.append(result.pop());
        }

        return sb.toString();
    }
}
