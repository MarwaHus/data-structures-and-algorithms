package linkedlist;
public class Node {
    public int value;
    public Node next; // pointer to the next Node
    public Node(int val) {
        value = val;
        next = null; // initialize next to null
    }
}