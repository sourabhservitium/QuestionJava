package com.example.javalibrary;

public class StarPattern1 {
    public static void main(String[] args) {
        /****
         ***
         **
         */

        for (int i = 1; i <= 4; i ++){
            for (int j = i; j <=4; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
