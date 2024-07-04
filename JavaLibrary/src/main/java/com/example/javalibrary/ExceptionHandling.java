package com.example.javalibrary;

public class ExceptionHandling {

    public static void main(String[] args){


        // Compilr time error
        //System.out.printLn("SOurabh");

        /*int i = 0;
        int j = 0;

        try {
            j = 18 / 0;
        } catch (Exception e){
            System.out.println("Something went wrong..");
        }
        System.out.println(i);

        System.out.println("Good..");*/

        // throw and throws

        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e){
            j = 18/1;
            System.out.println("That's the default output");
        }

        catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
    }
}
