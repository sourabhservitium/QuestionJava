package com.example.javalibrary;

public class LargestNumberUsingRecursion {
    public static void main(String[] args) {
        int[] arr1 = {5, 22, 6, 444, 7, 11, 65};
        System.out.println("largest element is: "+largest(arr1, 0));
    }

    private static int largest(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];

        int maximum = largest(arr, idx + 1);
        if (maximum < arr[idx])
            maximum = arr[idx];
        return maximum;
    }
}
