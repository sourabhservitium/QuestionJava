package com.example.javalibrary;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        int n = arr.length;
        int result = maxProfit(arr, 0, n - 1);
        System.out.println("Maximum profit: " +result);
        int result1 = maxProfit1(arr, n);
        System.out.println("Maximum profit is: " +result1);
    }

    private static int maxProfit1(int[] arr, int n) {

        int profit = 0;
        for (int i = 1; i < n; i ++){
            if (arr[i] > arr[i - 1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }

    private static int maxProfit(int[] arr, int start, int end) {

        if(end <= start){
            return 0;
        }
        int profit  = 0;
        for (int i = start; i < end; i++){
            for (int j = i+1; j <= end; j++){
                if (arr[j] > arr[i]){
                    int curr_profit = arr[j] - arr[i] +
                            maxProfit(arr, start, i-1) +
                            maxProfit(arr, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
}
