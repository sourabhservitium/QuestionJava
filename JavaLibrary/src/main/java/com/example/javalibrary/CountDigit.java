package com.example.javalibrary;

public class CountDigit {
    public static void main(String[] args) {
        int x = 6789;
        int count  = 0;

        do{
            x = x /10;
            count++;
        }
        while(x > 0);
        System.out.println(" Total count is : "+count);
    }
}
