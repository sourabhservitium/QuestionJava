package com.example.javalibrary;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();
        boolean result = isPrimeNumber(num);

        if (result) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // if divisible by any number other than 1 and itself, it is not prime
            }
        }
        return true; // if not divisible by any number other than 1 and itself, it is prime
    }
}
