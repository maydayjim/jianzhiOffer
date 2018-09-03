import java.util.Stack;
//思路：就两个栈，一个存出现过的最小数，注意考虑栈空的情况
public class SolutionHot21 {
    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty() || node < minStack.peek())
            minStack.push(node);
        else
            minStack.push(minStack.peek());
    }

    public void pop() {
        assert(!dataStack.isEmpty() && !minStack.isEmpty());
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        assert(!dataStack.isEmpty() && !minStack.isEmpty());
        return dataStack.peek();
    }

    public int min() {
        assert(!dataStack.isEmpty() && !minStack.isEmpty());
        return minStack.peek();
    }
}
