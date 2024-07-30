package com.example.javalibrary;

public class find2ndTopper {
    public static void main(String[] args) {
        int[][] marks = {
                {5, 2, 8},
                {8, 1, 9},
                {10, 10, 10},
                {5, 2, 9},
                {0, 8, 7},
                {8, 3, 8},
                {0, 8, 10},
                {8, 0, 8},
                {3, 10, 0},
                {2, 7, 8}
        };

        findSecondTopper(marks);
    }

    private static void findSecondTopper(int[][] marks) {

        int n = marks.length;
        int[] totalScores = new int[n];

        for (int i = 0; i < n; i++) {
            totalScores[i] = 0;
            for (int j = 0; j < marks[i].length; j++) {
                totalScores[i] += marks[i][j];
            }
            System.out.println("Total marks: " +totalScores[i]);
        }

        int highest = totalScores[0];
        int secondHighest = totalScores[0];
        for (int totalScore : totalScores) {
            if (totalScore > highest) {
                highest = totalScore;
            }
        }
        System.out.println(highest);

        for (int i = 0; i < n; i++) {
            if (totalScores[i] > secondHighest && totalScores[i] < highest) {
                secondHighest = totalScores[i];
            }
        }
        System.out.println(secondHighest);

        for (int i = 0; i < n; i++){
            if (totalScores[i] == secondHighest){
                System.out.println("Second topper is " + (i + 1) + " and score "+secondHighest);
                break;
            }
        }
    }
}
