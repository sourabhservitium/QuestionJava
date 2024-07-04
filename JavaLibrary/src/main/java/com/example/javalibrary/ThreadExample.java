package com.example.javalibrary;

public class ThreadExample extends Thread{

    /*A Thread is a very light-weighted process, or we can say the smallest part of the process that
     allows a program to operate more efficiently by running multiple tasks simultaneously.

    In order to perform complicated tasks in the background, we used the Thread concept in Java.
     All the tasks are executed without affecting the main program. In a program or process, all the
      threads have their own separate path for execution, so each thread of a process is independent.
*/
    public void run(){
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args){
        ThreadExample thread = new ThreadExample();
        thread.start();
    }
}
