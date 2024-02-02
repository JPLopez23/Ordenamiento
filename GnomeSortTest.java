package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GnomeSortTest {

    @Test
    void testGnomeSort() {
        Integer[] array = { 4, 3, 2, 10, 12, 1, 5, 6 };
        Integer[] sortedArray = { 1, 2, 3, 4, 5, 6, 10, 12 };

        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        gnomeSort.sort(array);

        assertArrayEquals(sortedArray, array);
    }
}