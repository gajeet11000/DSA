import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
  private Deque<Integer> stack;
  private Deque<Integer> minStack;

  public MinStack() {
    stack = new ArrayDeque<>();
    minStack = new ArrayDeque<>();
    minStack.push(Integer.MAX_VALUE);
  }

  public void push(int value) {
    stack.push(value);
    minStack.push(Math.min(value, minStack.peek()));
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}
