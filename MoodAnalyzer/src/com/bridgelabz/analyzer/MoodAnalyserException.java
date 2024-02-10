package com.bridgelabz.analyzer;

public class MoodAnalyserException extends Exception {

    private MoodAnalyser.MoodAnalyserError error;

    public MoodAnalyserException(MoodAnalyser.MoodAnalyserError error) {
        this.error = error;
    }


    public String getMessage(){
        switch (error){
            case NULL_MOOD:
                return "Invalid mood: Message is null";
            case EMPTY_MOOD:
                return "Invalid mood: Message is empty ";
            default:
                return "Unknown error";
        }
    }

}
