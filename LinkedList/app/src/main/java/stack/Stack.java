package stack;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (top == null) {
            top = newNode;
        } else {
            Node<T> temp = top;
            top = newNode;
            newNode.next = temp;
        }

    }
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        T value = top.value;
        top = top.next;
        return value;
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return top.value;
    }
    public boolean isEmpty() {
        return top == null;
    }
}