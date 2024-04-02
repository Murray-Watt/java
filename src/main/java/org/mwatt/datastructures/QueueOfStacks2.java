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

public class QueueOfStacks2 {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    public void push(int x) {
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }

        inStack.push(x);
        refillIfNeeded();
    }

    private void refillIfNeeded() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    public int pop() {
        refillIfNeeded();
        return outStack.pop();
    }

    public int peek() {
        refillIfNeeded();
        return outStack.peek();
    }

    public boolean empty() {
        refillIfNeeded();
        return outStack.isEmpty();
    }
}
