/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import org.junit.jupiter.api.Test;
import treeintersection.BinaryTree;
import treeintersection.TreeIntersection;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void setAndGetTest() {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        hashMap.set("one", 3);
        hashMap.set("two", 2);
        hashMap.set("three", 1);
        assertEquals(3, (int) hashMap.get("one"));
        assertEquals(2, (int) hashMap.get("two"));
        assertEquals(1, (int) hashMap.get("three"));
        hashMap.set("one", 5);
        assertEquals(5, (int) hashMap.get("one"));
    }

    @Test
    void nullTest() {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        assertNull(hashMap.get("four"));
    }

    @Test
    void keysTest() {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        hashMap.set("one", 3);
        hashMap.set("two", 2);
        hashMap.set("three", 1);
        Collection<String> keys = hashMap.keys();
        assertTrue(keys.contains("one"));
        assertTrue(keys.contains("two"));
        assertTrue(keys.contains("three"));
        hashMap.set("four", 4);
        keys = hashMap.keys();
        assertTrue(keys.contains("four"));
    }

    @Test
    void collisionTest() {
        HashMap<String, Integer> hashMap = new HashMap<>(1);
        hashMap.set("one", 5);
        hashMap.set("two", 10);
        assertEquals(5, (int) hashMap.get("one"));
        assertEquals(10, (int) hashMap.get("two"));
    }

    @Test
    void hashTest() {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        int hashValue = hashMap.hash("one");
        assertTrue(hashValue >= 0 && hashValue < 5);
    }
    @Test
    void repeatedWordTest() {
        String str = "Once upon a time, there was a brave princess who...";
        String result = HashMap.repeatedWord(str);
        assertEquals("a", result);

        str = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        result = HashMap.repeatedWord(str);
        assertEquals("summer", result);

    }
    @Test
    void testTreeIntersection() {
        BinaryTree<Integer> tree1 = new BinaryTree<>();
        tree1.insert(5);
        tree1.insert(10);
        tree1.insert(15);
        tree1.insert(20);
        BinaryTree<Integer> tree2 = new BinaryTree<>();
        tree2.insert(2);
        tree2.insert(8);
        tree2.insert(10);
        tree2.insert(15);
        HashSet<Integer> expected1 = new HashSet<>(Arrays.asList(10, 15));
        assertEquals(expected1, TreeIntersection.treeIntersection(tree1, tree2));

        BinaryTree<Integer> tree3 = new BinaryTree<>();
        tree3.insert(4);
        tree3.insert(6);
        tree3.insert(8);
        BinaryTree<Integer> tree4 = new BinaryTree<>();
        tree4.insert(2);
        tree4.insert(10);
        tree4.insert(12);
        HashSet<Integer> expected2 = new HashSet<>();
        assertEquals(expected2, TreeIntersection.treeIntersection(tree3, tree4));

        BinaryTree<Integer> tree5 = new BinaryTree<>();
        tree5.insert(1);
        tree5.insert(3);
        tree5.insert(5);
        BinaryTree<Integer> tree6 = new BinaryTree<>();
        tree6.insert(2);
        tree6.insert(5);
        tree6.insert(8);
        HashSet<Integer> expected3 = new HashSet<>(Collections.singletonList(5));
        assertEquals(expected3, TreeIntersection.treeIntersection(tree5, tree6));
    }
    @Test
    public void testLeftJoin() {
        Map<String, String> synonyms = new HashMap<>();
        synonyms.put("diligent", "employed");
        synonyms.put("fond", "enamored");
        synonyms.put("guide", "usher");
        synonyms.put("outfit", "garb");
        synonyms.put("wrath", "anger");

        Map<String, String> antonyms = new HashMap<>();
        antonyms.put("diligent", "idle");
        antonyms.put("fond", "averse");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");
        antonyms.put("wrath", "delight");

        List<String[]> expected = new ArrayList<>();
        expected.add(new String[]{"diligent", "employed", "idle"});
        expected.add(new String[]{"fond", "enamored", "averse"});
        expected.add(new String[]{"guide", "usher", "follow"});
        expected.add(new String[]{"outfit", "garb", null});
        expected.add(new String[]{"wrath", "anger", "delight"});

        List<String[]> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(expected.size(), result.size(), "Result size doesn't match expected size");
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i), "Values at index " + i + " don't match");
        }
    }
}

