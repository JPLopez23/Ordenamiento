import sorts.*;
import utils.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = "numbers.txt";
        int[] sizes = {10, 100, 500, 1000, 3000}; 

        for (int size : sizes) {
            NumberGenerator.generateNumbersToFile(filePath, size);
            List<Integer> numbers = FileHandler.readNumbersFromFile(filePath);
            Integer[] originalArray = numbers.toArray(new Integer[0]);

            QuickSort<Integer> quickSort = new QuickSort<>();
            long startTime = System.nanoTime();
            quickSort.sort(originalArray);
            long endTime = System.nanoTime();
            System.out.println("QuickSort Time for " + size + " numbers: " + (endTime - startTime) / 1_000_000.0 + " ms");
        }

        // Medir tiempos
        NumberGenerator.generateNumbersToFile(filePath, 3000);
        List<Integer> numbers = FileHandler.readNumbersFromFile(filePath);
        Integer[] sortedArray = numbers.toArray(new Integer[0]);

        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.sort(sortedArray); 

        long startTimeSorted = System.nanoTime();
        quickSort.sort(sortedArray); 
        long endTimeSorted = System.nanoTime();
        System.out.println("QuickSort Time for 3000 sorted numbers: " + (endTimeSorted - startTimeSorted) / 1_000_000.0 + " ms");
    }
}
