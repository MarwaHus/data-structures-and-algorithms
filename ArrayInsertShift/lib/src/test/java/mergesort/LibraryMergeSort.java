package mergesort;

import MergeSort.Merge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryMergeSort {
    @Test
    void mergeSort_WithUnsortedArray() {
        int[] arr = {5, 2, 8, 3, 1, 6, 9};
        Merge merge = new Merge();
        merge.mergeSort(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 5, 6, 8, 9}, arr);
    }

    @Test
    void mergeSort_WithEmptyArray() {
        int[] arr = {};
        Merge merge = new Merge();
        merge.mergeSort(arr);
        Assertions.assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void mergeSort_WithSingleElementArray() {
        int[] arr = {42};
        Merge merge = new Merge();
        merge.mergeSort(arr);
        Assertions.assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void mergeSort_WithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Merge merge = new Merge();
        merge.mergeSort(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void mergeSort_WithNegativeValues() {
        int[] arr = {-3, 5, 1, -2, 8, -7, 0};
        Merge merge = new Merge();
        merge.mergeSort(arr);
        Assertions.assertArrayEquals(new int[]{-7, -3, -2, 0, 1, 5, 8}, arr);
    }
}

