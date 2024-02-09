package com.bridgelabz.analyzer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st message: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter 2nd message: ");
        String text2 = scanner.nextLine();
        MoodAnalyser moodAnalyser1 = new MoodAnalyser(text1);
        MoodAnalyser moodAnalyser2 = new MoodAnalyser(text2);

        System.out.println("Mood: " + moodAnalyser1.analyserMood());
        System.out.println("Mood: " + moodAnalyser2.analyserMood());

    }
}
