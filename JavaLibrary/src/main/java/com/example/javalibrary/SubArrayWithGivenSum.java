package com.example.javalibrary;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int givenSUm = 399;
        System.out.println(isSubSum(arr, givenSUm));

//        boolean found = false;
//
//        for(int i = 0; i < n; i++){
//            int sum1  = 0;
//            for(int j = i; j < n; j++){
//                sum1 += arr[j];
//                if(sum1 == givenSUm){
//                    System.out.println("SubArray with giveSum is found so it's true!");
//                    found = true;
//                    break;
//                }
//            }
//            if (found){
//                break;
//            }
//        }
//        if (!found){
//            System.out.println("SUbArray with givenSum is not found.");
//        }
    }

    private static boolean isSubSum(int[] arr, int givenSUm) {
        for(int i = 0; i < arr.length; i++){
            int curr = 0;
            for (int j = i; j < arr.length; j++){
                curr += arr[j];
                if (curr == givenSUm)
                    return true;
            }
        }
        return false;
    }
}
