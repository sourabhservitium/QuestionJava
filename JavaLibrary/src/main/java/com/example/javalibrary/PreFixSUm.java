package com.example.javalibrary;

public class PreFixSUm {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int a = 0, b = 3;
        int res = getSum(0, 3, arr);
        System.out.println("Prefix sum is "+res);
    }

    private static int getSum(int i, int i1, int arr[]) {
        int sum = 0;
        for (int k = i; k <= i1; k++){
            sum += arr[k];
        }
        return sum;
    }
}
