package tree;


import java.util.ArrayList;

public class BinaryTree<T> {
    public Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public ArrayList<T> preorder() {
        ArrayList<T> values = new ArrayList<T>();
        preorderHelper(this.root, values);
        return values;
    }

    private void preorderHelper(Node<T> node, ArrayList<T> values) {
        if (node == null) {
            return;
        }
        values.add(node.value);
        preorderHelper(node.left, values);
        preorderHelper(node.right, values);
    }

    public ArrayList<T> inorder() {
        ArrayList<T> values = new ArrayList<T>();
        inorderHelper(this.root, values);
        return values;
    }

    private void inorderHelper(Node<T> node, ArrayList<T> values) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left, values);
        values.add(node.value);
        inorderHelper(node.right, values);
    }

    public ArrayList<T> postorder() {
        ArrayList<T> values = new ArrayList<T>();
        postorderHelper(this.root, values);
        return values;
    }

    private void postorderHelper(Node<T> node, ArrayList<T> values) {
        if (node == null) {
            return;
        }
        postorderHelper(node.left, values);
        postorderHelper(node.right, values);
        values.add(node.value);
    }
    public T findMaximumValue() {
        if (root == null) {
            throw new NoSuchElementException("Binary Tree is empty!");
        }

        Node<T> current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }
    public List<T> breadthFirst() {
        List<T> values = new ArrayList<>();

        int height = getHeight(root);
        for (int i = 1; i <= height; i++) {
            bfsHelper(root, i, values);
        }

        return values;
    }

    private int getHeight(Node<T> node) {
        if (node == null) {
            return 0;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return 1 + Math.max(left, right);
    }

    private void bfsHelper(Node<T> node, int level, List<T> values) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            values.add(node.value);
        } else if (level > 1) {
            bfsHelper(node.left, level - 1, values);
            bfsHelper(node.right, level - 1, values);
        }
    }


}