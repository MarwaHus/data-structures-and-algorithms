package treeintersection;
import hashtable.HashMap;
import java.util.HashSet;
import java.util.List;
    public class TreeIntersection {
        public static HashSet<Integer> treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2) {
            List<Integer> list1 = tree1.inOrder();
            List<Integer> list2 = tree2.inOrder();
            HashSet<Integer> intersection = new HashSet<>();
            HashMap<Integer, Integer> map = new HashMap<>(list1.size());
            for (Integer integer : list1) {
                map.set(integer, 1);
            }
            for (Integer integer : list2) {
                if (map.has(integer)) {
                    intersection.add(integer);
                }
            }
            return intersection;
        }
    }
