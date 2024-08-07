package com.example.javalibrary;

public class MaximumEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 7 , 8};
        int n = arr.length;
        int result = maxEvenOddSubArray(arr, n);
        System.out.println("Maximum length of Even Odd SubArray is: "+result);
    }

    private static int maxEvenOddSubArray(int[] arr, int n) {

        int curr = 1;
        int res = 1;
        for (int i = 1; i < n; i++){
            if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                    (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)){
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }
}
