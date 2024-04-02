package org.mwatt.datastructures;

import java.util.Stack;

/*
| Stack Method | Deque Method |
|--------------|--------------|
| `push(element)` | `addLast(element)` |
| `pop()` | `removeLast()` |
| `peek()` | `peekLast()` |
| `isEmpty()` | `isEmpty()` |
| `size()` | `size()` |

 */

public class QueueOfStacks1 {
    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    public void push(int x) {
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }

        inStack.push(x);

        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

    public int pop() {
        return outStack.pop();
    }

    public int peek() {
        return outStack.peek();
    }

    public boolean empty() {
        return outStack.isEmpty();
    }
}
