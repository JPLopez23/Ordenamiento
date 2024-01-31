package sorts;

public class GnomeSort<T extends Comparable<T>> {

    public void gnomeSort(T[] array) {
        int index = 0;
        while (index < array.length) {
            if (index == 0) index++;
            if (array[index].compareTo(array[index - 1]) >= 0) {
                index++;
            } else {
                T temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
}
