package arrayinsertshift;
import Insertion.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LibraryTestInsertion {
    @Test
    public void testSort() {
        int[] arr = {5, 7, 1, 9, 3};
        int[] sortedArr = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(sortedArr, InsertionSort.sort(arr));
    }
    @Test
    public void testSortEmptyArray() {
        int[] arr = {};
        int[] sortedArr = {};
        Assertions.assertArrayEquals(sortedArr, InsertionSort.sort(arr));
    }
    @Test
    public void testSortSingleElementArray() {
        int[] arr = {5};
        int[] sortedArr = {5};

        Assertions.assertArrayEquals(sortedArr, InsertionSort.sort(arr));
    }

    @Test
    public void testSortNegativeNumbers() {
        int[] arr = {5, -7, 1, -9, 3};
        int[] sortedArr = {-9, -7, 1, 3, 5};

        Assertions.assertArrayEquals(sortedArr, InsertionSort.sort(arr));
    }
}