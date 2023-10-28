/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import java.util.List;

public class App {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        hashMap.set("one", 3);
        hashMap.set("two", 2);
        hashMap.set("three", 1);
        System.out.println("one= " + hashMap.get("one"));
        System.out.println("four= " + hashMap.has("four"));
        List<String> keys = hashMap.keys();
        System.out.println("Keys in HashMap: " + keys);
        hashMap.set("four", 4);
        System.out.println("four= " + hashMap.get("four"));
        keys = hashMap.keys();
        System.out.println("New keys in HashMap: " + keys);
        System.out.println("HashMap size: " + hashMap.size);
    }
}