/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package arrayinsertshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void insertShiftArray() {
        Library sut = new Library();
        int[] arr1 = {5, 8, 1, 20};
        int[] result1 =sut.insertShiftArray(arr1, 10);
        Assertions.assertArrayEquals(new int[]{5, 8, 10,1, 20}, result1);
    }
}