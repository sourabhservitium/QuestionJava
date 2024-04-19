package com.example.javalibrary;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};

        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
}
