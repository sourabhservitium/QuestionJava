package com.example.javalibrary;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x  = 78987;
        int rev = 0;
        int temp  = x;
        while (temp > 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        if(x == rev) System.out.println("Palindrome Number");
         else System.out.println("not a palindrome");
    }
}
