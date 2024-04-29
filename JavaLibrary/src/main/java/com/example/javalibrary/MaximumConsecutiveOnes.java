package com.example.javalibrary;

public class MaximumConsecutiveOnes {
    public static void main(String[] args){
        int[] arr = {0, 1, 1, 0, 1, 1, 1, 1};
        int res = 0, curr = 0;

/*        for(int i = 0; i < arr.length; i++){
            int curr = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == 1)
                curr++;
                else break;
            }
            res = Math.max(curr, res);
        }
        System.out.println(res);*/

        for (int j : arr) {
            if (j == 0)
                curr = 0;
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }

        System.out.println(res);

    }
}
