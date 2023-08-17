package linkedlist;
public class LinkedList {

    public Node head; // head property

    public LinkedList() {
        head = null;
    }
    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{ ");
        Node current = head;
        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(" } -> { ");
            } else {
                result.append(" } -> NULL");
            }
            current = current.next;
        }
        return result.toString();
    }
}
