package com.bridgelabz.analyzer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws MoodAnalyserException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st message: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter 2nd message: ");
        String text2 = scanner.nextLine();

        String text3 = null;
        MoodAnalyser moodAnalyser1 = new MoodAnalyser(text1);
        MoodAnalyser moodAnalyser2 = new MoodAnalyser(text2);
        MoodAnalyser moodAnalyser3 = new MoodAnalyser(text3);

        try {
            System.out.println("Mood: " + moodAnalyser1.analyserMood());
        }
        catch (MoodAnalyserException e){
            System.out.println(e.getMessage());

        }

        try {
            System.out.println("Mood: " + moodAnalyser2.analyserMood());
        }
        catch (MoodAnalyserException e){
            System.out.println(e.getMessage());

        }

        try {
            System.out.println("Mood: " + moodAnalyser3.analyserMood());
        }
        catch (MoodAnalyserException e){
            System.out.println(e.getMessage());

        }
    }
}
