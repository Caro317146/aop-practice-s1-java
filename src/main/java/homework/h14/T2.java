package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

public class T2 {
  public static class MyQueue {
    private final Deque<Integer> inStack = new ArrayDeque<>();
    private final Deque<Integer> outStack = new ArrayDeque<>();

    public MyQueue() {}

    public void push(int x) {
      inStack.push(x);
    }

    public int pop() {
      shiftStacks();
      return outStack.pop();
    }

    public int peek() {
      shiftStacks();
      return outStack.peek();
    }

    public boolean empty() {
      return inStack.isEmpty() && outStack.isEmpty();
    }

    private void shiftStacks() {
      if (outStack.isEmpty()) {
        while (!inStack.isEmpty()) {
          outStack.push(inStack.pop());
        }
      }
    }
  }
}
