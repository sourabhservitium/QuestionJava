package com.example.javalibrary;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
//        reverse(arr);
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int j : array) {
            System.out.println(j);
        }

    }

//    public static void reverse(int[] array) {
//        int start = 0;
//        int end = array.length - 1;
//
//        while (start < end) {
//            // Swap elements at start and end
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//
//            // Move towards the center
//            start++;
//            end--;
//        }
//    }
}
