package org.example.generics;

import java.util.Arrays;

public class SortArray {

    public static <T extends Comparable<T>> void sortArray(T[] array) {
        if (array == null) {
            return;
        }

        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sortArrayV2(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        Integer[] array = {8, 10, 1, 4, 7, 9, 3, 6, 2, 5};
        sortArrayV2(array);
        System.out.println(Arrays.toString(array));
    }
}
