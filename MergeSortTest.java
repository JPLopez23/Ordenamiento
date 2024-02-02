package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void testMergeSort() {
        Integer[] array = { 4, 3, 2, 10, 12, 1, 5, 6 };
        Integer[] sortedArray = { 1, 2, 3, 4, 5, 6, 10, 12 };

        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(array);

        assertArrayEquals(sortedArray, array);
    }
}
