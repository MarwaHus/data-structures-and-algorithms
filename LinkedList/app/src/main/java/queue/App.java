package queue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty());
        queue.enqueue(40);
        System.out.println(queue.peek());
        PseudoQueue<Integer> queue1 = new PseudoQueue<>();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        System.out.println(queue1.dequeue());
        System.out.println(queue1.peek());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.isEmpty());
    }
}

