/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testLinkedListInstantiation() {
        LinkedList<Number> list = new LinkedList<Number>();
        assertNull(list.head);
    }
    @Test
    public void testLinkedListInsertion() {
        LinkedList<Number> list = new LinkedList<Number>();
        list.insert(5);
        assertNotNull(list.head);
        assertEquals(5, list.head.value);
    }
    @Test
    public void testLinkedListMultipleInsertion() {
        LinkedList<Number> list = new LinkedList<Number>();
        list.insert(5);
        list.insert(3);
        list.insert(1);
        assertEquals(1, list.head.value);
        assertEquals(3, list.head.next.value);
        assertEquals(5, list.head.next.next.value);
    }
    @Test
    public void testLinkedListIncludesValue() {
        LinkedList<Number> list = new LinkedList<Number>();
        list.insert(5);
        list.insert(3);
        list.insert(1);
        assertTrue(list.includes(3));
    }
    @Test
    public void testLinkedListDoesNotIncludeValue() {
        LinkedList<Number> list = new LinkedList<Number>();
        list.insert(5);
        list.insert(3);
        list.insert(1);
        assertFalse(list.includes(10));
    }
    @Test
    public void testLinkedListToString() {
        LinkedList<Number> list = new LinkedList<Number>();
        list.insert(5);
        list.insert(3);
        list.insert(1);
        assertEquals("{ 1 } -> { 3 } -> { 5 } -> NULL", list.toString());
    }
    @Test
    public void testAppend() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        assertEquals("{ 1 } -> NULL", list.toString());
    }
    @Test
    public void testAppendMultipleNodes() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> NULL", list.toString());
    }
    @Test
    public void testInsertBeforeInMiddle() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.insertBefore(2, 5);
        assertEquals("{ 1 } -> { 5 } -> { 2 } -> { 3 } -> NULL", list.toString());
    }
    @Test
    public void testInsertBeforeAtBeginning() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.insertBefore(1, 5);
        assertEquals("{ 5 } -> { 1 } -> { 2 } -> NULL", list.toString());
    }
    @Test
    public void testInsertAfterInMiddle() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.insertAfter(2, 5);
        assertEquals("{ 1 } -> { 2 } -> { 5 } -> { 3 } -> NULL", list.toString());
    }
    @Test
    public void testInsertAfterAtEnd() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.insertAfter(2, 5);
        assertEquals("{ 1 } -> { 2 } -> { 5 } -> NULL", list.toString());
    }
    @Test
    public void testKthGreaterThanTheLength () {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.kthFromEnd(4);
        });
    }

    @Test
    public void testKthAndLengthAreSame() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(1, list.kthFromEnd(3));
    }

    @Test
    public void testKIsNotPositive() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertThrows(IndexOutOfBoundsException.class, () -> {list.kthFromEnd(-1);});
        System.out.println(list);

    }

    @Test
    public void testKListSizeIs1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        assertEquals(1, list.kthFromEnd(1));
        System.out.println(list);
        System.out.println(list.kthFromEnd(1));
    }

    @Test
    public void testKInMiddleOfList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        assertEquals(3, list.kthFromEnd(3));
        System.out.println(list);
        System.out.println(list.kthFromEnd(3));
    }
    @Test
    public void testFindMiddleNode() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        Node middleNode =list.findMiddleNode(list);
        assertEquals(4, middleNode.value);
        System.out.println(middleNode.value);
    }
    @Test
    void testZipListsWithEmptyList() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(2);
        list1.insert(1);

        LinkedList<Integer> list2 = new LinkedList<>();

        LinkedList<Integer> result = list1.zipLists(list1, list2);
        String expectedResult = "{ 1 } -> { 2 } -> NULL";
        assertEquals(expectedResult, result.toString());

    }

    @Test
    void testZipListsWithDifferentLengths() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(5);
        list1.insert(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.insert(6);
        list2.insert(4);
        list2.insert(2);

        LinkedList<Integer> result = list1.zipLists(list1, list2);
        String expectedResult = "{ 3 } -> { 2 } -> { 5 } -> { 4 } -> { 6 } -> NULL";
        assertEquals(expectedResult, result.toString());
    }

    @Test
    void testZipListsWithOneItemEach() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.insert(6);

        LinkedList<Integer> result = list1.zipLists(list1, list2);
        String expectedResult = "{ 5 } -> { 6 } -> NULL";
        assertEquals(expectedResult, result.toString());
    }




    @Test
    void testZipLists() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(5);
        list1.insert(3);
        list1.insert(1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.insert(6);
        list2.insert(4);
        list2.insert(2);

        LinkedList<Integer> result = list1.zipLists(list1, list2);
        String expectedResult = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> NULL";
        assertEquals(expectedResult, result.toString());

    }
}





