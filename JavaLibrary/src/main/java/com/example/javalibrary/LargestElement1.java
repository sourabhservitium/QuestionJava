package com.example.javalibrary;

public class LargestElement1 {

    static int getLargest(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i ++){
            boolean flag = true;
            for (int j = 0; j < n; j++){
                if (arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 20, 13};
        System.out.println(getLargest(arr));
    }
}
