package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {
    Queue<Integer> queue = new Queue<>();
    @Test
    void testEnqueue() {
        queue.enqueue(10);
        assertEquals(10, queue.peek());
    }

    @Test
    void testEnqueueMultiple() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(10, queue.peek());
    }

    @Test
    void testDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.dequeue());
        assertEquals(20, queue.peek());
    }

    @Test
    void testPeek() {
        queue.enqueue(10);
        assertEquals(10, queue.peek());
    }

    @Test
    void testEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void testEmptyAfterDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testDequeueOnEmptyQueue() {
        assertThrows(RuntimeException.class, () -> {
            queue.dequeue();
        });
    }

    @Test
    void testPeekOnEmptyQueue() {
        assertThrows(RuntimeException.class, () -> {
            queue.peek();
        });
    }
}