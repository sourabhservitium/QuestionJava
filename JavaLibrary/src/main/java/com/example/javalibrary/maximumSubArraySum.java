package com.example.javalibrary;

public class maximumSubArraySum {

    public static void main(String[] args) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        int maxSum = maxSubArraySum(arr, n);
        System.out.println("Maximum SubArray sum is: "+maxSum);
        int result = maxSum(arr, n);
        System.out.println("Maximum SubArraySum issss: "+result);
        int res = maximumSum(arr, n);
        System.out.println("Maximum sum of subarray is: "+res);
    }

    private static int maxSubArraySum(int[] arr, int n) {
        int sum = 0, maximumSum = 0;
        for (int i = 0; i < n; i ++){
            sum += arr[i];
            if(sum > maximumSum){
                maximumSum = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return maximumSum;
    }

    private static int maxSum(int[] arr, int n) {

        int res = arr[0];
        for (int i= 0; i < n; i++){
            int curr = 0;
            for (int j = i; j < n; j++){
                curr += arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    private static int maximumSum(int[] arr, int n) {

        int res = arr[0];
        int maxEnding = arr[0];
        for (int i= 1; i < n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
