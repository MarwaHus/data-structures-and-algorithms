package queue;

import stack.Stack;


public class PseudoQueue<T>  {
    private Stack<T> stack1;
    private Stack<T> stack2;
    public PseudoQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T value) {
        stack1.push(value);
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        T value = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return value;
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        T value = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return value;
    }
    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}