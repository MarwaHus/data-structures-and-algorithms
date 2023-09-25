package tree;

import java.util.ArrayList;
import java.util.List;

public class KaryNode<T> {
    T value;
    List<KaryNode<T>> children;

    public KaryNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public List<KaryNode<T>> getChildren() {
        return children;
    }

    public KaryNode<T> getRoot() {
        return null;
    }
}