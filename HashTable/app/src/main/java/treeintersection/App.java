package treeintersection;

import static treeintersection.TreeIntersection.treeIntersection;

public class App {
        public static void main(String[] args) {
            BinaryTree<Integer> tree1 = new BinaryTree<>();
            tree1.insert(150);
            tree1.insert(100);
            tree1.insert(75);
            tree1.insert(160);
            tree1.insert(125);
            tree1.insert(175);
            tree1.insert(250);
            tree1.insert(200);
            tree1.insert(350);
            tree1.insert(300);
            tree1.insert(500);
            BinaryTree<Integer> tree2 = new BinaryTree<>();
            tree2.insert(42);
            tree2.insert(100);
            tree2.insert(600);
            tree2.insert(15);
            tree2.insert(160);
            tree2.insert(200);
            tree2.insert(350);
            tree2.insert(4);
            tree2.insert(500);
            tree2.insert(175);
            System.out.println(treeIntersection(tree1, tree2));
        }
}