package queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PseudoQueueTest {
    @Test
    void testEnqueue() {
        PseudoQueue<String> queue = new PseudoQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals("A", queue.peek());
    }

    @Test
    void testDequeue() {
        PseudoQueue<Integer> queue = new PseudoQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertThrows(RuntimeException.class, queue::dequeue);
    }



    @Test
    void testIsEmpty() {
        PseudoQueue<Integer> queue = new PseudoQueue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}

