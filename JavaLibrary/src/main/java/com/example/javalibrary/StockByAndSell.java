package com.example.javalibrary;

public class StockByAndSell {
    public static void main(String[] args){
        int[] arr = {2, 7, 3, 6, 12};
        int profit = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        System.out.println(profit);
    }
}
