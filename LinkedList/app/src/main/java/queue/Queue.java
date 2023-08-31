package queue;

public class Queue<T> {
    private Node<T> front;
    public Queue() {
        this.front = null;
    }
    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (front == null) {
            front = newNode;
        } else {
            Node<T> temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T value = front.value;
        front = front.next;
        return value;
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.value;
    }
    public boolean isEmpty() {
        return front == null;
    }
}