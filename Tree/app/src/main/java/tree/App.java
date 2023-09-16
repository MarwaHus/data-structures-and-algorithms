package tree;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(14);
        tree.add(4);
        tree.add(7);
        tree.add(13);

        System.out.println("Preorder traversal: " + tree.preorder());
        System.out.println("Inorder traversal: " + tree.inorder());
        System.out.println("Postorder traversal: " + tree.postorder());

        System.out.println("Contains 7? " + tree.contains(7));
        System.out.println("Contains 11? " + tree.contains(11));
    }
}