package com.example.javalibrary;

public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int z = -1;
        int w = 33;

        System.out.println(x & y); // AND
        System.out.println(x | y); // OR
        System.out.println(x ^ y); // XOR
        System.out.println(z << 1); // Left Shift
        System.out.println(~x); // Not Operator
        System.out.println(w >> 1); // Signed Right
        System.out.println(); //
    }
}
