package com.example.javalibrary;

public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 34, 65, 44, 9};
        int max = arr[0];



        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("largest element is: "+max);

    }
}
