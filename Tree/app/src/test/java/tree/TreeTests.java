package tree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TreeTests {
    private BinarySearchTree<Integer> emptyTree = new BinarySearchTree<Integer>();
    private BinarySearchTree<Integer> singleNodeTree = new BinarySearchTree<Integer>();
    private BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    @Test
    void testEmptyTree() {
        assertNull(emptyTree.root);
    }

    @Test
    void testSingleNodeTree() {
        singleNodeTree.add(5);
        assertEquals(5, singleNodeTree.root.value);
        assertNull(singleNodeTree.root.left);
        assertNull(singleNodeTree.root.right);
    }

    @Test
    void testAddToTree() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(18);
        assertEquals(10, tree.root.value);
        assertEquals(5, tree.root.left.value);
        assertEquals(3, tree.root.left.left.value);
        assertEquals(7, tree.root.left.right.value);
        assertEquals(15, tree.root.right.value);
        assertEquals(13, tree.root.right.left.value);
        assertEquals(18, tree.root.right.right.value);
    }

    @Test
    void testPreorderTraversal() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(18);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(10);
        expected.add(5);
        expected.add(3);
        expected.add(7);
        expected.add(15);
        expected.add(13);
        expected.add(18);
        assertEquals(expected, tree.preorder());
    }

    @Test
    void testInorderTraversal() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(18);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(10);
        expected.add(13);
        expected.add(15);
        expected.add(18);
        assertEquals(expected, tree.inorder());
    }

    @Test
    void testPostorderTraversal() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(18);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(7);
        expected.add(5);
        expected.add(13);
        expected.add(18);
        expected.add(15);
        expected.add(10);
        assertEquals(expected, tree.postorder());
    }

    @Test
    void testContains() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(18);
        assertTrue(tree.contains(10));
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(15));
        assertTrue(tree.contains(3));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(13));
        assertTrue(tree.contains(18));
        assertFalse(tree.contains(1));
        assertFalse(tree.contains(20));
    }
    @Test
    public void testFindMaximumValue() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.root = new Node<>(10);
        binaryTree.root.left = new Node<>(8);
        binaryTree.root.right = new Node<>(12);
        binaryTree.root.left.left = new Node<>(5);
        binaryTree.root.left.right = new Node<>(9);
        binaryTree.root.right.left = new Node<>(11);
        binaryTree.root.right.right = new Node<>(15);

        int maxVal = binaryTree.findMaximumValue(binaryTree.root);
        assertEquals(15, maxVal);
    }
    @Test
    void testBreadthFirst() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.root = new Node<>(10);
        binaryTree.root.left = new Node<>(8);
        binaryTree.root.right = new Node<>(12);
        binaryTree.root.left.left = new Node<>(5);
        binaryTree.root.left.right = new Node<>(9);
        binaryTree.root.right.left = new Node<>(11);
        binaryTree.root.right.right = new Node<>(15);

        List<Integer> expected = Arrays.asList(10, 8, 12, 5, 9, 11, 15);
        List<Integer> actual = binaryTree.breadthFirst();

        assertEquals(expected, actual);
    }
}

