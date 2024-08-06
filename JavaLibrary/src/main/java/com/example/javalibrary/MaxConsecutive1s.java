package com.example.javalibrary;

public class MaxConsecutive1s {

    public static void main(String[] args) {

        int[] array = {0, 1, 1, 1, 1, 0};
        int n = array.length;
        int result = consecutiveOnes(array, n);
        System.out.println("Consecutive 1's are: "+result);
    }

    private static int consecutiveOnes(int[] array, int n) {

        int count  = 0, res = 0;
        for (int i = 0; i < n; i ++){
            if(array[i] == 1){
                count++;
                res = Math.max(res, count);
            } else {
                count = 0;
            }
        }
        return res;
    }
}
