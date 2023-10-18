package MergeSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {8,4,23,42,16,15};
        Merge mergeSort = new Merge();
        mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
