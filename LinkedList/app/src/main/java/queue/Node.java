package queue;

public class Node<T> {
    T value;
    queue.Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}