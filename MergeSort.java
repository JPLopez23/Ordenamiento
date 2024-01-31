package sorts;

public class MergeSort<T extends Comparable<T>> {

    public void mergeSort(T[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(T[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];

        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, middle + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
