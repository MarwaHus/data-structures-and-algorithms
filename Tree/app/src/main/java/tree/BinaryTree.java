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
    public  int findMaximumValue(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int result = (int) node.value;
        int left = findMaximumValue(node.left);
        int right = findMaximumValue(node.right);

        if (left > result)
            result = left;
        if (right > result)
            result = right;
        return result;
    }
}

