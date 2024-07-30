package com.example.javalibrary;

public class SortArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {7, 2, 8, 5, 4};

        System.out.println("arr1 is sorted: " + isSorted(arr1));
        System.out.println("arr2 is sorted: " + isSorted(arr2));
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
