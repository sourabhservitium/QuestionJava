package com.example.javalibrary;

public class CountFrequency {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        countFreq(arr);
    }
    public static void countFreq(int[] arr) {
        int n = arr.length;
        boolean[] temp = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (temp[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    temp[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " " + count);
        }
    }


}
