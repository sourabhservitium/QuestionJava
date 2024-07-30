package com.example.javalibrary;

public class ReverseAnArrayUsingRecursion {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array, 0, array.length -1);
        for (int j : array) {
            System.out.print(j);
        }
    }

    public static void reverse(int[] array, int start, int end){
        if(start >= end){
            return;
        }

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverse(array, start + 1, end - 1);

    }
}
