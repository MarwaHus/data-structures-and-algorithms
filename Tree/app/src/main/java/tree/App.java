package tree;

public class App {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.root = new Node<>(10);
        binaryTree.root.left = new Node<>(8);
        binaryTree.root.right = new Node<>(12);
        binaryTree.root.left.left = new Node<>(5);
        binaryTree.root.left.right = new Node<>(9);
        binaryTree.root.right.left = new Node<>(11);
        binaryTree.root.right.right = new Node<>(15);
        System.out.println("Preorder traversal: " + binaryTree.preorder());
        System.out.println("Inorder traversal: " + binaryTree.inorder());
        System.out.println("Postorder traversal: " + binaryTree.postorder());
        System.out.println("Maximum value in binary tree is: " + binaryTree.findMaximumValue(binaryTree.root));
    }
}