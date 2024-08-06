package com.example.javalibrary;

public class LeadersOnArray {

    //Leader on array -> There is nothing which is greater than this element on right of it
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 6, 5, 2};

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.println(arr[i]);
            }
        }

//    ----------------------------------------------------------------------

        int curr_leader = arr[arr.length - 1];
        System.out.println(curr_leader);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (curr_leader < arr[i]) {
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
        }
    }
}
