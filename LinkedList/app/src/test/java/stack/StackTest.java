package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    private Stack<String> stack = new Stack<>();
    @Test
    public void testPushToStack() {
        stack.push("apple");
        Assertions.assertEquals(false, stack.isEmpty());
        Assertions.assertEquals("apple", stack.peek());

    }
    @Test
    public void testPushMultipleValues() {
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");

        Assertions.assertEquals(false, stack.isEmpty());
        Assertions.assertEquals("orange", stack.peek());
    }
    @Test
    public void testPop() {
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");

        Assertions.assertEquals("orange", stack.pop());
        Assertions.assertEquals("banana", stack.pop());
        Assertions.assertEquals("apple", stack.pop());
    }
    @Test
    public void testEmptyStack() {
        stack.push("apple");
        stack.push("banana");
        stack.pop();
        stack.pop();
        Assertions.assertEquals(true, stack.isEmpty());
    }
    @Test
    public void testPeek() {
        stack.push("apple");
        stack.push("banana");
        Assertions.assertEquals("banana", stack.peek());
    }

    @Test
    public void testEmptyStackException() {
        Assertions.assertThrows(RuntimeException.class, () -> stack.peek());
        Assertions.assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    public void testInstantiateEmptyStack() {
        Assertions.assertEquals(true, stack.isEmpty());
    }
}