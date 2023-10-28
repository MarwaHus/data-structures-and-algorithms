package hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class HashMap<K, V> {
    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
    int size;
    public HashMap(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("HashMap size must be 1 or greater!");
        }
        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);
        for (int i = 0; i < this.size; i++) {
            bucketArrayList.add(i, new LinkedList<>());
        }
    }
    public void set(K key, V value) {
        int index = hash(key);
        LinkedList<HashMapPair<K, V>> pairs = bucketArrayList.get(index);
        for (HashMapPair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }
        pairs.add(new HashMapPair<>(key, value));
    }
    public V get(K key) {
        int index = hash(key);
        LinkedList<HashMapPair<K, V>> pairs = bucketArrayList.get(index);
        for (HashMapPair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }
    public boolean has(K key) {
        int index = hash(key);
        LinkedList<HashMapPair<K, V>> pairs = bucketArrayList.get(index);
        for (HashMapPair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }
    public  List<K> keys() {
        List<K> keys = new ArrayList<>();
        for (LinkedList<HashMapPair<K, V>> pairs : bucketArrayList) {
            for (HashMapPair<K, V> pair : pairs) {
                keys.add(pair.getKey());
            }
        }
        return keys;
    }
    public int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }
}