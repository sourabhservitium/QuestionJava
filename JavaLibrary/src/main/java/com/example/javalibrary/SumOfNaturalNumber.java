package com.example.javalibrary;

public class SumOfNaturalNumber {

    public static void main(String[] args){

        int n = 3;

        // First Solution
        int sum  = 0;
        for (int i = 1; i <= n; i ++){
            sum += i;
        }
        System.out.println(sum);

        // Second Solution
        int sum1 = fun(n);
        System.out.println(sum1);

        // Third Solution
        int sum2 = fun2(n);
        System.out.println(sum2);
    }

    public static int fun(int n){
        return n * (n + 1)/2;
    }

    public static int fun2(int n){
        int sum = 0;
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= i; j++){
                sum ++;
            }
        }
        return sum;
    }
}
