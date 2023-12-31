/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package arraybs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    public static int BinarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;}
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }}
        return -1;
    }
}
