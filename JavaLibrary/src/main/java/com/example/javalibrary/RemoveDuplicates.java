package com.example.javalibrary;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40};
        int n = arr.length;
//        removeDuplicatesEle(array, n);
//        for (int j : array) System.out.print(array[j] + " ");
        n = removeDuplicatesEle(arr, n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    private static int removeDuplicatesEle(int[] arr, int n) {

//        int[] temp = new int[n];
//        temp[0] = array[0];
//        int res = 1;
//
//        for (int i = 1; i < n; i++){
//            if (temp[res-1] != array[i]){
//                temp[res] = array[i];
//                res++;
//            }
//        }
//        for (int i = 1; i < res; i++){
//            array[i] = temp[i];
//        }
//        return res;


//        -------------------------------------------
//        int res = 1;
//        for (int i = 1; i < n; i++){
//            if(array[i] != array[res - 1]){
//                array[res] = array[i];
//                res++;
//            }
//        }

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }
}
