package tree;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {
    public void add(T value) {
        this.root = addHelper(this.root, value);
    }

    private Node<T> addHelper(Node<T> node, T value) {
        if (node == null) {
            return new Node<T>(value);
        }
        if (value.compareTo(node.value) < 0) {
            node.left = addHelper(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = addHelper(node.right, value);
        }
        return node;
    }

    public boolean contains(T value) {
        return containsHelper(this.root, value);
    }

    private boolean containsHelper(Node<T> node, T value) {
        if (node == null) {
            return false;
        }
        if (value.compareTo(node.value) == 0) {
            return true;
        } else if (value.compareTo(node.value) < 0) {
            return containsHelper(node.left, value);
        } else {
            return containsHelper(node.right, value);
        }
    }
}
