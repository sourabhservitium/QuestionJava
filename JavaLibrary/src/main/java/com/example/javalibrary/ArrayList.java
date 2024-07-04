package com.example.javalibrary;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ArrayList {

    public static void main(String[] args){
        List<Integer> nums = new java.util.ArrayList<>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        System.out.println(nums.get(2));

        /*for (Integer n : nums){
            int num = n;
            System.out.println(num*2);
        }*/
    }
}
