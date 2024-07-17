package com.example.javalibrary;

public class LCM {
    public static void main(String[] args) {
        int a = 15, b = 12;
        int res = Math.max(a, b);
        while (true){
            if (res % a == 0 && res % b == 0){
                System.out.println(res);
                res++;
            }
        }

    }
}
