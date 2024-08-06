package com.example.javalibrary;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {12, 33, 12, 6, 4, 88, 3};
        int n = arr.length;
        int result = maximumDifference(arr, n);
        System.out.println("Maximum difference is: "+ result);
        int result1 = maxDifference(arr, n);
        System.out.println("MaxDifference is: "+result1);
        int result2 = maxDiff(arr, n);
        System.out.println("maximin diff is: "+result2);
    }

    private static int maximumDifference(int[] arr, int n) {

        int res = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++){
            for (int j = i +1 ; j < n; j++){
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }

    private static int maxDifference(int[] arr, int n) {

        int res = Integer.MIN_VALUE, minValue = arr[0];
        for (int j = 1; j < n; j++){
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue, arr[j]);
        }
        return res;
    }

    private static int maxDiff(int[] arr, int n) {

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxDifference = max - min;
        return maxDifference;
    }
}
