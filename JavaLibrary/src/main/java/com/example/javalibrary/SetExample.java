package com.example.javalibrary;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args){

        /*Set<Integer> nums = new HashSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
            System.out.println(values.next());

        for (int n : nums){
            System.out.println(n);
        }*/

        Set<String> name = new HashSet<String>();
        name.add("Ravi");
        name.add("Sourabh");
        name.add("Vishu");
        name.add("Kapil");
        name.add("Harsh");
        name.add("Sourabh");

        System.out.println("list of names: "+name);
        name.remove("Ravi");
        System.out.println("Invoke 1 name "+name);

        HashSet<String> name1=new HashSet<String>();
        name1.add("Ajay");
        name1.add("Gaurav");
        name.addAll(name1);
        System.out.println("Updated List: "+name);

        name.removeAll(name1);
        System.out.println("After invoking removeAll() method: "+name);

        name.clear();
        System.out.println("After clear: "+name);

    }
}
