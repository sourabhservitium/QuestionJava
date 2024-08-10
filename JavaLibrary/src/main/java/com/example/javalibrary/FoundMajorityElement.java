package com.example.javalibrary;

public class FoundMajorityElement {

    public static void main(String[] args) {
        int[] arr = {12, 12, 12, 54, 12, 34, 12, 8 , 8};
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int count = 1;
            for (int j = i + 1; j < n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > args.length / 2){
                System.out.println("Majority element "+arr[i]);
                break;
            }
        }
    }
}
