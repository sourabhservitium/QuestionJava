package com.example.javalibrary;

public class StartPattern5 {

    //    *
    //   * *
    //  * * *
    public static void main(String[] args) {

        int row = 3;

        for(int i = 0; i < row; i++){

            for(int j = i; j <= row-1; j++){

                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
