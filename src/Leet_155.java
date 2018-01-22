import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2018-1-21.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 Example:
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> Returns -3.
 minStack.pop();
 minStack.top();      --> Returns 0.
 minStack.getMin();   --> Returns -2.

 */
class MinStack {
    List<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<Integer>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return 0;
    }
}
public class Leet_155 {
}
