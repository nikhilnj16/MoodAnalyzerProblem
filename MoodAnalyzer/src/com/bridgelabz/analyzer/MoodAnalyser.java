package com.bridgelabz.analyzer;

public class MoodAnalyser {
    private String message;

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
    public String analyserMood() {
        try {
            if (message == null){
                return "Happy";
            }
            if (message.isEmpty()) {
                throw new MoodAnalyserException("Invalid mood message is empty");
            }
            if (message.toLowerCase().contains("sad") || message.toLowerCase().contains("unhappy") || message.toLowerCase().contains("not happy")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (MoodAnalyserException e){
            return "Invalid mood message is empty";

        }
    }
}
