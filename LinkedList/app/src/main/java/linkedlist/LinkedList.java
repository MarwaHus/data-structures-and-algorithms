package linkedlist;
public class LinkedList<T extends Number> {

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
    public void append(int  value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            return;
        }
        if (Objects.equals(head.value, value)) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (Objects.equals(current.next.value, value)) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }
    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            if (Objects.equals(current.value, value)) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }
    public int kthFromEnd(int k) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        if (k > length || k <= 0) {
            throw new IndexOutOfBoundsException();
        }
        current = head;
        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }
        return current.value;
    }
    public Node findMiddleNode(LinkedList list) {
        if (list.head == null) {
            return null;
        }
        Node one = list.head;
        Node two = list.head;
        while (two != null && two.next != null) {
            one = one.next;
            two = two.next.next;
        }
        return one;
    }
}

