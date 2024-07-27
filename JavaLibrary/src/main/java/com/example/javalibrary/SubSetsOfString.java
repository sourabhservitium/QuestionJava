package com.example.javalibrary;

import java.util.ArrayList;
import java.util.List;

public class SubSetsOfString {

    public static List<String> generateSubsets(String str) {
        List<String> subsets = new ArrayList<>();
        generateSubsetsHelper(str, "", 0, subsets);
        return subsets;
    }

    private static void generateSubsetsHelper(String str, String current, int index, List<String> subsets) {
        if (index == str.length()) {
            subsets.add(current);
            return;
        }

        // Include the current character
        generateSubsetsHelper(str, current + str.charAt(index), index + 1, subsets);

        // Exclude the current character
        generateSubsetsHelper(str, current, index + 1, subsets);
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = generateSubsets(input);
        System.out.println("Subsets of the string \"" + input + "\":");
        for (String subset : result) {
            System.out.println(subset);
        }
    }
}
