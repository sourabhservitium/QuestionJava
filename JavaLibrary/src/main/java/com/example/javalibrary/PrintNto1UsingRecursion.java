package com.example.javalibrary;

public class PrintNto1UsingRecursion {

    public static void main(String[] args) {

        int n = 5;
        print1ToN(n);
    }

    public static void print1ToN(int n){
        if( n == 0){
            return;
        }
        System.out.println(n +" ");
        print1ToN(n - 1);
    }
}
