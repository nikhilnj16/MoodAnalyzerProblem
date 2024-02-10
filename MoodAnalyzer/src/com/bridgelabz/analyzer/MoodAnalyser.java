package com.bridgelabz.analyzer;

public class MoodAnalyser {
    private String message;

    enum MoodAnalyserError {
        NULL_MOOD,
        EMPTY_MOOD
    }

    public  MoodAnalyser(){
        this.message="";
    }


    public MoodAnalyser(String message) {
        this.message = message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public String analyserMood() throws MoodAnalyserException{
        try {
            if (message == null){
                throw new MoodAnalyserException(MoodAnalyserError.NULL_MOOD);
            }
            if (message.isEmpty()) {
                throw new MoodAnalyserException(MoodAnalyserError.EMPTY_MOOD);
            }
            if (message.toLowerCase().contains("sad") || message.toLowerCase().contains("unhappy") || message.toLowerCase().contains("not happy")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (MoodAnalyserException e){
            throw e;

        }
    }
}
