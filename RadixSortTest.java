package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void testRadixSort() {
        int[] array = { 4, 3, 2, 10, 12, 1, 5, 6 };
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 10, 12 };

        RadixSort.radixSort(array);

        assertArrayEquals(sortedArray, array);
    }
}
