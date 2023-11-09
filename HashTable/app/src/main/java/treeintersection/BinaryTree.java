package treeintersection;

import java.util.List;

public class BinaryTree<T extends Comparable<T>> {

    protected Node<T> root;

    public BinaryTree() {
       this.root=null;
    }

    public void insert(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            root.insert(value);
        }
    }

    public List<T> inOrder() {
        if (root == null) {
            return null;
        }
        return root.inOrder();
    }
}