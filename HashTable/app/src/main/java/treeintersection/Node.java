package treeintersection;
import java.util.ArrayList;
import java.util.List;
public class Node<T extends Comparable<T>> {
    protected T data;
    protected Node<T> leftChild, rightChild;
    public Node(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
    public void insert(T value) {
        if (value.compareTo(data) < 0) {
            if (leftChild == null) {
                leftChild = new Node<>(value);
            } else {
                leftChild.insert(value);
            }
        } else if (value.compareTo(data) > 0) {
            if (rightChild == null) {
                rightChild = new Node<>(value);
            } else {
                rightChild.insert(value);
            }
        }
    }
    public List<T> inOrder() {
        List<T> values = new ArrayList<>();
        if (leftChild != null) {
            values.addAll(leftChild.inOrder());
        }
        values.add(data);
        if (rightChild != null) {
            values.addAll(rightChild.inOrder());
        }
        return values;
    }
}