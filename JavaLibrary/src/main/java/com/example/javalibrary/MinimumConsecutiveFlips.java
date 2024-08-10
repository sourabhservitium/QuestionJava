package com.example.javalibrary;

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr ={1, 1, 0, 0, 0, 1};
        int n  = arr.length;
        for(int i = 0; i < n; i ++){
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == 0 && arr[j] == 0) {
                    continue;
                }
                System.out.println("from: " + arr[i] + "to" +arr[j]);
            }
        }
    }
}
