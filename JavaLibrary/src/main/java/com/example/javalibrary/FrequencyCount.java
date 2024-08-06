package com.example.javalibrary;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 25, 30, 30};
        int n  = arr.length;;
        int count  = 1;
        boolean flag = false;
        for (int i = 0; i < n; i ++){
            if(arr[i] == arr[i + 1]){
                count++;
                flag = true;
            }
            if (!flag) {
                System.out.println(arr[i] + " " + count);
            }
        }
    }
}
