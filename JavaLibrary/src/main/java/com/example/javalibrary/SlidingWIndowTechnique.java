package com.example.javalibrary;

public class SlidingWIndowTechnique {
    public static void main(String[] args) {
        int[] arr = {1, 8, 30, -5, 20, 7};
        int n = arr.length;
        int k = 3;
        System.out.println(maxSum(arr, n, k));
    }

    private static int maxSum(int[] arr, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i + k - 1 < n; i++){
            int sum = 0;
            for (int j = 0; j < k; j++){
                sum = sum + arr[i + j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

//    private static int maxSum(int[] arr, int k) {
//        int n = arr.length;
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i <= n - k; i++) {
//            int sum = 0;
//            for (int j = i; j < i + k; j++) {
//                sum += arr[j];
//            }
//            maxSum = Math.max(maxSum, sum);
//        }
//        return maxSum;
//    }
}
