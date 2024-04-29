package com.example.javalibrary;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr = {3, 6, 3, 8, 9, 9, 9, 9, 9};
        int majorityCount = arr.length / 2;

        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > majorityCount){
                System.out.println("Majority Element: " + arr[i]);
                break;
            }
        }
    }
}

